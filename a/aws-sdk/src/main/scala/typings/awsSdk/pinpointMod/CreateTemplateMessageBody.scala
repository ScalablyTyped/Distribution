package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateMessageBody extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the message template that was created.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The message that's returned from the API for the request to create the message template.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the request to create the message template.
    */
  var RequestID: js.UndefOr[string] = js.undefined
}
object CreateTemplateMessageBody {
  
  @scala.inline
  def apply(): CreateTemplateMessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateMessageBody]
  }
  
  @scala.inline
  implicit class CreateTemplateMessageBodyMutableBuilder[Self <: CreateTemplateMessageBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setRequestID(value: string): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
  }
}
