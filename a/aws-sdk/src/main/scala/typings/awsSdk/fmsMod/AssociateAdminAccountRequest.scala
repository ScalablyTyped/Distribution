package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID to associate with Firewall Manager as the Firewall Manager administrator account. This must be an Organizations member account. For more information about Organizations, see Managing the Amazon Web Services Accounts in Your Organization. 
    */
  var AdminAccount: AWSAccountId
}
object AssociateAdminAccountRequest {
  
  inline def apply(AdminAccount: AWSAccountId): AssociateAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccount = AdminAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAdminAccountRequest]
  }
  
  extension [Self <: AssociateAdminAccountRequest](x: Self) {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
  }
}
