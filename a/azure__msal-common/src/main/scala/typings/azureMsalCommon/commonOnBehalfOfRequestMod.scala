package typings.azureMsalCommon

import typings.azureMsalCommon.baseAuthRequestMod.BaseAuthRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonOnBehalfOfRequestMod {
  
  trait CommonOnBehalfOfRequest
    extends StObject
       with BaseAuthRequest {
    
    var oboAssertion: String
    
    var skipCache: js.UndefOr[Boolean] = js.undefined
  }
  object CommonOnBehalfOfRequest {
    
    inline def apply(authority: String, correlationId: String, oboAssertion: String, scopes: js.Array[String]): CommonOnBehalfOfRequest = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], oboAssertion = oboAssertion.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonOnBehalfOfRequest]
    }
    
    extension [Self <: CommonOnBehalfOfRequest](x: Self) {
      
      inline def setOboAssertion(value: String): Self = StObject.set(x, "oboAssertion", value.asInstanceOf[js.Any])
      
      inline def setSkipCache(value: Boolean): Self = StObject.set(x, "skipCache", value.asInstanceOf[js.Any])
      
      inline def setSkipCacheUndefined: Self = StObject.set(x, "skipCache", js.undefined)
    }
  }
}
