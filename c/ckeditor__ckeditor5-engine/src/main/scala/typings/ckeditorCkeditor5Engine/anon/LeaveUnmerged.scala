package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaveUnmerged extends js.Object {
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined
  var leaveUnmerged: js.UndefOr[Boolean] = js.undefined
}

object LeaveUnmerged {
  @scala.inline
  def apply(
    doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined,
    leaveUnmerged: js.UndefOr[Boolean] = js.undefined
  ): LeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotResetEntireContent)) __obj.updateDynamic("doNotResetEntireContent")(doNotResetEntireContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveUnmerged)) __obj.updateDynamic("leaveUnmerged")(leaveUnmerged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaveUnmerged]
  }
}

