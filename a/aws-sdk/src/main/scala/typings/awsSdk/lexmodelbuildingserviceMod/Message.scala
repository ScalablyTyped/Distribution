package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The text of the message.
    */
  var content: ContentString
  
  /**
    * The content type of the message string.
    */
  var contentType: ContentType
  
  /**
    * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex returns one message from each group in the response.
    */
  var groupNumber: js.UndefOr[GroupNumber] = js.undefined
}
object Message {
  
  @scala.inline
  def apply(content: ContentString, contentType: ContentType): Message = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ContentString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumber(value: GroupNumber): Self = StObject.set(x, "groupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNumberUndefined: Self = StObject.set(x, "groupNumber", js.undefined)
  }
}
