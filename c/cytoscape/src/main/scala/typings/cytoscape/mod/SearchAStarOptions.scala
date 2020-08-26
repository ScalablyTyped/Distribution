package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
@js.native
trait SearchAStarOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.native
  var goal: Selector | CollectionArgument = js.native
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, Double]] = js.native
  var root: Selector | CollectionArgument = js.native
  var weight: js.UndefOr[WeightFn] = js.native
}

object SearchAStarOptions {
  @scala.inline
  def apply(goal: Selector | CollectionArgument, root: Selector | CollectionArgument): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarOptions]
  }
  @scala.inline
  implicit class SearchAStarOptionsOps[Self <: SearchAStarOptions] (val x: Self) extends AnyVal {
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
    def setGoal(value: Selector | CollectionArgument): Self = this.set("goal", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirected: Self = this.set("directed", js.undefined)
    @scala.inline
    def setHeuristic(value: /* node */ NodeCollection => Double): Self = this.set("heuristic", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeuristic: Self = this.set("heuristic", js.undefined)
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

