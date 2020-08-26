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
  def apply(): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardValidationMessage]
  }
  @scala.inline
  implicit class DashboardValidationMessageOps[Self <: DashboardValidationMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataPath(value: DataPath): Self = this.set("DataPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPath: Self = this.set("DataPath", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

