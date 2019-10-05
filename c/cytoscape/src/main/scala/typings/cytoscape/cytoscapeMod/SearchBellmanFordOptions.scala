package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
trait SearchBellmanFordOptions extends js.Object {
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: Boolean
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchBellmanFordOptions {
  @scala.inline
  def apply(directed: Boolean, root: js.Any, weight: /* edge */ EdgeCollection => Double = null): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed, root = root)
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
}

