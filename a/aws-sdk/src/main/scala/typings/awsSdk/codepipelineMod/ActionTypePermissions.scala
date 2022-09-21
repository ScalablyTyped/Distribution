package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypePermissions extends StObject {
  
  /**
    * A list of AWS account IDs with access to use the action type in their pipelines.
    */
  var allowedAccounts: AllowedAccounts
}
object ActionTypePermissions {
  
  inline def apply(allowedAccounts: AllowedAccounts): ActionTypePermissions = {
    val __obj = js.Dynamic.literal(allowedAccounts = allowedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypePermissions]
  }
  
  extension [Self <: ActionTypePermissions](x: Self) {
    
    inline def setAllowedAccounts(value: AllowedAccounts): Self = StObject.set(x, "allowedAccounts", value.asInstanceOf[js.Any])
    
    inline def setAllowedAccountsVarargs(value: AllowedAccount*): Self = StObject.set(x, "allowedAccounts", js.Array(value*))
  }
}
