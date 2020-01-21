package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
trait SearchDijkstraOptions extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  /**
    * The root node (selector or collection) where the algorithm starts.
    */
  var root: Selector | CollectionArgument
  /**
    * A function that returns the positive numeric weight for this edge.
    *
    * If no weight function is defined, a constant weight of 1 is used for each edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchDijkstraOptions {
  @scala.inline
  def apply(
    root: Selector | CollectionArgument,
    directed: js.UndefOr[Boolean] = js.undefined,
    weight: /* edge */ EdgeCollection => Double = null
  ): SearchDijkstraOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchDijkstraOptions]
  }
}

