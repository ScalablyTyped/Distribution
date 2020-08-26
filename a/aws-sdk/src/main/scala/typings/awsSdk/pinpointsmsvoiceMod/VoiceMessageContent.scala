package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMessageContent extends js.Object {
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.native
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.native
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.native
}

object VoiceMessageContent {
  @scala.inline
  def apply(): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessageContent]
  }
  @scala.inline
  implicit class VoiceMessageContentOps[Self <: VoiceMessageContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallInstructionsMessage(value: CallInstructionsMessageType): Self = this.set("CallInstructionsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallInstructionsMessage: Self = this.set("CallInstructionsMessage", js.undefined)
    @scala.inline
    def setPlainTextMessage(value: PlainTextMessageType): Self = this.set("PlainTextMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlainTextMessage: Self = this.set("PlainTextMessage", js.undefined)
    @scala.inline
    def setSSMLMessage(value: SSMLMessageType): Self = this.set("SSMLMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSMLMessage: Self = this.set("SSMLMessage", js.undefined)
  }
  
}

