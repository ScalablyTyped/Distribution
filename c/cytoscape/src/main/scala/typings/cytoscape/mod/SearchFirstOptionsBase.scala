package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFirstOptionsBase extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  /**
    * A handler function that is called when a node is visited in the search.
    */
  var visit: js.UndefOr[SearchVisitFunction] = js.undefined
}

object SearchFirstOptionsBase {
  @scala.inline
  def apply(
    directed: js.UndefOr[Boolean] = js.undefined,
    visit: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit = null
  ): SearchFirstOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (visit != null) __obj.updateDynamic("visit")(js.Any.fromFunction5(visit))
    __obj.asInstanceOf[SearchFirstOptionsBase]
  }
}

