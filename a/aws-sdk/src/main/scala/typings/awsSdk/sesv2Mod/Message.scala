package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or both.
    */
  var Body: typings.awsSdk.sesv2Mod.Body
  
  /**
    * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify non-ASCII characters in the subject line by using encoded-word syntax, as described in RFC 2047.
    */
  var Subject: Content
}
object Message {
  
  @scala.inline
  def apply(Body: Body, Subject: Content): Message = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Content): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
