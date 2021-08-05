package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS Account ID for the organization account to be enabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String
}
object EnableOrganizationAdminAccountRequest {
  
  inline def apply(AdminAccountId: String): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  extension [Self <: EnableOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
