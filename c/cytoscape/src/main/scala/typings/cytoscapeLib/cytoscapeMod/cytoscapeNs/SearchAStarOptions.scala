package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.aStar
  */
trait SearchAStarOptions extends js.Object {
  var directed: js.UndefOr[scala.Boolean] = js.undefined
  var goal: Selector | CollectionArgument
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, scala.Double]] = js.undefined
  var root: Selector | CollectionArgument
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchAStarOptions {
  @scala.inline
  def apply(
    goal: Selector | CollectionArgument,
    root: Selector | CollectionArgument,
    directed: js.UndefOr[scala.Boolean] = js.undefined,
    heuristic: js.Function1[/* node */ NodeCollection, scala.Double] = null,
    weight: WeightFn = null
  ): SearchAStarOptions = {
    val __obj = js.Dynamic.literal(goal = goal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (heuristic != null) __obj.updateDynamic("heuristic")(heuristic)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[SearchAStarOptions]
  }
}

