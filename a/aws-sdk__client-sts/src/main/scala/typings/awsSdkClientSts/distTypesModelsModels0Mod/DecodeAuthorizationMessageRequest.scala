package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageRequest extends StObject {
  
  /**
    * <p>The encoded message that was returned with the response.</p>
    */
  var EncodedMessage: js.UndefOr[String] = js.undefined
}
object DecodeAuthorizationMessageRequest {
  
  inline def apply(): DecodeAuthorizationMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
  }
  
  extension [Self <: DecodeAuthorizationMessageRequest](x: Self) {
    
    inline def setEncodedMessage(value: String): Self = StObject.set(x, "EncodedMessage", value.asInstanceOf[js.Any])
    
    inline def setEncodedMessageUndefined: Self = StObject.set(x, "EncodedMessage", js.undefined)
  }
}
