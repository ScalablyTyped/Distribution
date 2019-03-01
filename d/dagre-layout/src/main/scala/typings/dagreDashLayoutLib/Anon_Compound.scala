package typings
package dagreDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compound extends js.Object {
  var compound: js.UndefOr[scala.Boolean] = js.undefined
  var directed: js.UndefOr[scala.Boolean] = js.undefined
  var multigraph: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Compound {
  @scala.inline
  def apply(
    compound: js.UndefOr[scala.Boolean] = js.undefined,
    directed: js.UndefOr[scala.Boolean] = js.undefined,
    multigraph: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Compound = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound)
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (!js.isUndefined(multigraph)) __obj.updateDynamic("multigraph")(multigraph)
    __obj.asInstanceOf[Anon_Compound]
  }
}

