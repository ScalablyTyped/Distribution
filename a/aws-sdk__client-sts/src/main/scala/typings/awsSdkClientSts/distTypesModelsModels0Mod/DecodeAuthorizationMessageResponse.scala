package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageResponse extends StObject {
  
  /**
    * <p>The API returns a response with the decoded message.</p>
    */
  var DecodedMessage: js.UndefOr[String] = js.undefined
}
object DecodeAuthorizationMessageResponse {
  
  inline def apply(): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
  
  extension [Self <: DecodeAuthorizationMessageResponse](x: Self) {
    
    inline def setDecodedMessage(value: String): Self = StObject.set(x, "DecodedMessage", value.asInstanceOf[js.Any])
    
    inline def setDecodedMessageUndefined: Self = StObject.set(x, "DecodedMessage", js.undefined)
  }
}
