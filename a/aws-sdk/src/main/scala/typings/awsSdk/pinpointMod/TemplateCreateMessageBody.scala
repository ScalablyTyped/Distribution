package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateCreateMessageBody extends StObject {
  
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
object TemplateCreateMessageBody {
  
  inline def apply(): TemplateCreateMessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateCreateMessageBody]
  }
  
  extension [Self <: TemplateCreateMessageBody](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setRequestID(value: string): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
    
    inline def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
  }
}
