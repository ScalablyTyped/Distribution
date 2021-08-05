package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAccount extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the account as a delegated administrator of Amazon Macie for the organization.
    */
  var status: js.UndefOr[AdminStatus] = js.undefined
}
object AdminAccount {
  
  inline def apply(): AdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccount]
  }
  
  extension [Self <: AdminAccount](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setStatus(value: AdminStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
