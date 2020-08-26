package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
@js.native
trait SearchDijkstraOptions extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.native
  /**
    * The root node (selector or collection) where the algorithm starts.
    */
  var root: Selector | CollectionArgument = js.native
  /**
    * A function that returns the positive numeric weight for this edge.
    *
    * If no weight function is defined, a constant weight of 1 is used for each edge.
    */
  var weight: js.UndefOr[WeightFn] = js.native
}

object SearchDijkstraOptions {
  @scala.inline
  def apply(root: Selector | CollectionArgument): SearchDijkstraOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDijkstraOptions]
  }
  @scala.inline
  implicit class SearchDijkstraOptionsOps[Self <: SearchDijkstraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirected: Self = this.set("directed", js.undefined)
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

