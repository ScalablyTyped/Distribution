package typings.blueprintjsTable.truncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITruncatedFormatState extends js.Object {
  var isPopoverOpen: js.UndefOr[Boolean] = js.undefined
  var isTruncated: js.UndefOr[Boolean] = js.undefined
}

object ITruncatedFormatState {
  @scala.inline
  def apply(isPopoverOpen: js.UndefOr[Boolean] = js.undefined, isTruncated: js.UndefOr[Boolean] = js.undefined): ITruncatedFormatState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPopoverOpen)) __obj.updateDynamic("isPopoverOpen")(isPopoverOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTruncated)) __obj.updateDynamic("isTruncated")(isTruncated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITruncatedFormatState]
  }
}

