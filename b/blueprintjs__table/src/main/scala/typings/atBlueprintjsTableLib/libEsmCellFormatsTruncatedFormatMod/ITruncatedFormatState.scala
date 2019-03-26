package typings
package atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITruncatedFormatState extends js.Object {
  var isPopoverOpen: js.UndefOr[scala.Boolean] = js.undefined
  var isTruncated: js.UndefOr[scala.Boolean] = js.undefined
}

object ITruncatedFormatState {
  @scala.inline
  def apply(
    isPopoverOpen: js.UndefOr[scala.Boolean] = js.undefined,
    isTruncated: js.UndefOr[scala.Boolean] = js.undefined
  ): ITruncatedFormatState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPopoverOpen)) __obj.updateDynamic("isPopoverOpen")(isPopoverOpen)
    if (!js.isUndefined(isTruncated)) __obj.updateDynamic("isTruncated")(isTruncated)
    __obj.asInstanceOf[ITruncatedFormatState]
  }
}

