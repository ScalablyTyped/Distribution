package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAccount extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var AdminAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the account is enabled as the delegated administrator.
    */
  var AdminStatus: js.UndefOr[typings.awsSdk.guarddutyMod.AdminStatus] = js.undefined
}
object AdminAccount {
  
  inline def apply(): AdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccount]
  }
  
  extension [Self <: AdminAccount](x: Self) {
    
    inline def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountIdUndefined: Self = StObject.set(x, "AdminAccountId", js.undefined)
    
    inline def setAdminStatus(value: AdminStatus): Self = StObject.set(x, "AdminStatus", value.asInstanceOf[js.Any])
    
    inline def setAdminStatusUndefined: Self = StObject.set(x, "AdminStatus", js.undefined)
  }
}
