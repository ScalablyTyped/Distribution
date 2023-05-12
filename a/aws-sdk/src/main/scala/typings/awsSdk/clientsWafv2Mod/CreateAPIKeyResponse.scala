package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAPIKeyResponse extends StObject {
  
  /**
    * The generated, encrypted API key. You can copy this for use in your JavaScript CAPTCHA integration. 
    */
  var APIKey: js.UndefOr[typings.awsSdk.clientsWafv2Mod.APIKey] = js.undefined
}
object CreateAPIKeyResponse {
  
  inline def apply(): CreateAPIKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAPIKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAPIKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setAPIKey(value: APIKey): Self = StObject.set(x, "APIKey", value.asInstanceOf[js.Any])
    
    inline def setAPIKeyUndefined: Self = StObject.set(x, "APIKey", js.undefined)
  }
}
