package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawMessage extends js.Object {
  /**
    * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   Attachments must be in a file format that the Amazon SES supports.   The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
    */
  var Data: RawMessageData = js.native
}

object RawMessage {
  @scala.inline
  def apply(Data: RawMessageData): RawMessage = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawMessage]
  }
  @scala.inline
  implicit class RawMessageOps[Self <: RawMessage] (val x: Self) extends AnyVal {
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
    def setData(value: RawMessageData): Self = this.set("Data", value.asInstanceOf[js.Any])
  }
  
}

