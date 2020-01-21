package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardValidationMessage extends js.Object {
  /**
    * The data path related to the message.
    */
  var DataPath: js.UndefOr[typings.awsSdk.cloudwatchMod.DataPath] = js.native
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[typings.awsSdk.cloudwatchMod.Message] = js.native
}

object DashboardValidationMessage {
  @scala.inline
  def apply(DataPath: DataPath = null, Message: Message = null): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    if (DataPath != null) __obj.updateDynamic("DataPath")(DataPath.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardValidationMessage]
  }
}

