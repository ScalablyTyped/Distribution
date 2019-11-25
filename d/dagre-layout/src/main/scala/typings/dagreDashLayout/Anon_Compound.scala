package typings.dagreDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compound extends js.Object {
  var compound: js.UndefOr[Boolean] = js.undefined
  var directed: js.UndefOr[Boolean] = js.undefined
  var multigraph: js.UndefOr[Boolean] = js.undefined
}

object Anon_Compound {
  @scala.inline
  def apply(
    compound: js.UndefOr[Boolean] = js.undefined,
    directed: js.UndefOr[Boolean] = js.undefined,
    multigraph: js.UndefOr[Boolean] = js.undefined
  ): Anon_Compound = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (!js.isUndefined(multigraph)) __obj.updateDynamic("multigraph")(multigraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compound]
  }
}

