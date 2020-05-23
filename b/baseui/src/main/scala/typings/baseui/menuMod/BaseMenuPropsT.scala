package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMenuPropsT extends js.Object {
  var renderAll: js.UndefOr[Boolean] = js.undefined
}

object BaseMenuPropsT {
  @scala.inline
  def apply(renderAll: js.UndefOr[Boolean] = js.undefined): BaseMenuPropsT = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuPropsT]
  }
}

