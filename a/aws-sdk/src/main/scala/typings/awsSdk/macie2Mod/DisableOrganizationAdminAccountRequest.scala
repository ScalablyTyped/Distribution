package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS account ID of the delegated administrator account.
    */
  var adminAccountId: string = js.native
}
object DisableOrganizationAdminAccountRequest {
  
  @scala.inline
  def apply(adminAccountId: string): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit class DisableOrganizationAdminAccountRequestMutableBuilder[Self <: DisableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: string): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
  }
}
