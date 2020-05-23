package typings.dagreLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compound extends js.Object {
  var compound: js.UndefOr[Boolean] = js.undefined
  var directed: js.UndefOr[Boolean] = js.undefined
  var multigraph: js.UndefOr[Boolean] = js.undefined
}

object Compound {
  @scala.inline
  def apply(
    compound: js.UndefOr[Boolean] = js.undefined,
    directed: js.UndefOr[Boolean] = js.undefined,
    multigraph: js.UndefOr[Boolean] = js.undefined
  ): Compound = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multigraph)) __obj.updateDynamic("multigraph")(multigraph.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compound]
  }
}

