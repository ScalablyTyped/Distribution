package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawMessage extends StObject {
  
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
  implicit class RawMessageMutableBuilder[Self <: RawMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: RawMessageData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
