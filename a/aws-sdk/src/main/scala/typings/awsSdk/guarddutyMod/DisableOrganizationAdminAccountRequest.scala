package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS Account ID for the organizations account to be disabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String
}
object DisableOrganizationAdminAccountRequest {
  
  inline def apply(AdminAccountId: String): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  
  extension [Self <: DisableOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
