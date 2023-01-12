package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountCcsCredentialMod {
  
  @js.native
  sealed trait CcsCredentialType extends StObject
  @JSImport("@azure/msal-common/dist/account/CcsCredential", "CcsCredentialType")
  @js.native
  object CcsCredentialType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CcsCredentialType & String] = js.native
    
    @js.native
    sealed trait HOME_ACCOUNT_ID
      extends StObject
         with CcsCredentialType
    /* "home_account_id" */ val HOME_ACCOUNT_ID: typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredentialType.HOME_ACCOUNT_ID & String = js.native
    
    @js.native
    sealed trait UPN
      extends StObject
         with CcsCredentialType
    /* "UPN" */ val UPN: typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredentialType.UPN & String = js.native
  }
  
  trait CcsCredential extends StObject {
    
    var credential: String
    
    var `type`: CcsCredentialType
  }
  object CcsCredential {
    
    inline def apply(credential: String, `type`: CcsCredentialType): CcsCredential = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcsCredential]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CcsCredential] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setType(value: CcsCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
