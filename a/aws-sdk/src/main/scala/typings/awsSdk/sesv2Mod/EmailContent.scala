package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailContent extends StObject {
  
  /**
    * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   If you include attachments, they must be in a file format that the Amazon SES API v2 supports.    The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
    */
  var Raw: js.UndefOr[RawMessage] = js.undefined
  
  /**
    * The simple email message. The message consists of a subject and a message body.
    */
  var Simple: js.UndefOr[Message] = js.undefined
  
  /**
    * The template to use for the email message.
    */
  var Template: js.UndefOr[typings.awsSdk.sesv2Mod.Template] = js.undefined
}
object EmailContent {
  
  @scala.inline
  def apply(): EmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailContent]
  }
  
  @scala.inline
  implicit class EmailContentMutableBuilder[Self <: EmailContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: RawMessage): Self = StObject.set(x, "Raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "Raw", js.undefined)
    
    @scala.inline
    def setSimple(value: Message): Self = StObject.set(x, "Simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleUndefined: Self = StObject.set(x, "Simple", js.undefined)
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "Template", js.undefined)
  }
}
