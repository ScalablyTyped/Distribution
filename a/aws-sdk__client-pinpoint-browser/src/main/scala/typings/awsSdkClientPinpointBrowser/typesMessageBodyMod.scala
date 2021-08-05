package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageBodyMod {
  
  trait MessageBody extends StObject {
    
    /**
      * The error message that's returned from the API.
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * The unique message body ID.
      */
    var RequestID: js.UndefOr[String] = js.undefined
  }
  object MessageBody {
    
    inline def apply(): MessageBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBody]
    }
    
    extension [Self <: MessageBody](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRequestID(value: String): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
      
      inline def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
    }
  }
  
  type UnmarshalledMessageBody = MessageBody
}
