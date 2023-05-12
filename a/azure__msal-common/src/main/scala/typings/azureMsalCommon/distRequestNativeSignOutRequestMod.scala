package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestNativeSignOutRequestMod {
  
  trait NativeSignOutRequest extends StObject {
    
    var accountId: String
    
    var clientId: String
    
    var correlationId: String
  }
  object NativeSignOutRequest {
    
    inline def apply(accountId: String, clientId: String, correlationId: String): NativeSignOutRequest = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSignOutRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeSignOutRequest] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    }
  }
}
