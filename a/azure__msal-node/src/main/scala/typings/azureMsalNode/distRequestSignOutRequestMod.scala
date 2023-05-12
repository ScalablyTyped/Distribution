package typings.azureMsalNode

import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestSignOutRequestMod {
  
  trait SignOutRequest extends StObject {
    
    var account: AccountInfo
    
    var correlationId: js.UndefOr[String] = js.undefined
  }
  object SignOutRequest {
    
    inline def apply(account: AccountInfo): SignOutRequest = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOutRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignOutRequest] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: AccountInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    }
  }
}
