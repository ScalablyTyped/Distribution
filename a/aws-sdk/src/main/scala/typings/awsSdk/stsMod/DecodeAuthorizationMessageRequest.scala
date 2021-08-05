package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageRequest extends StObject {
  
  /**
    * The encoded message that was returned with the response.
    */
  var EncodedMessage: encodedMessageType
}
object DecodeAuthorizationMessageRequest {
  
  inline def apply(EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal(EncodedMessage = EncodedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
  
  extension [Self <: DecodeAuthorizationMessageRequest](x: Self) {
    
    inline def setEncodedMessage(value: encodedMessageType): Self = StObject.set(x, "EncodedMessage", value.asInstanceOf[js.Any])
  }
}
