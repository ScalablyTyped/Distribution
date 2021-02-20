package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS Account ID for the organization account to be enabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String = js.native
}
object EnableOrganizationAdminAccountRequest {
  
  @scala.inline
  def apply(AdminAccountId: String): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit class EnableOrganizationAdminAccountRequestMutableBuilder[Self <: EnableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
