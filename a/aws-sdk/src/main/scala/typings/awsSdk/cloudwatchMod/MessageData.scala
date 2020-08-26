package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageData extends js.Object {
  /**
    * The error code or status code associated with the message.
    */
  var Code: js.UndefOr[MessageDataCode] = js.native
  /**
    * The message text.
    */
  var Value: js.UndefOr[MessageDataValue] = js.native
}

object MessageData {
  @scala.inline
  def apply(): MessageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageData]
  }
  @scala.inline
  implicit class MessageDataOps[Self <: MessageData] (val x: Self) extends AnyVal {
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
    def setCode(value: MessageDataCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setValue(value: MessageDataValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

