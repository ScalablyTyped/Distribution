package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS account ID for the account to designate as the delegated Amazon Macie administrator account for the organization.
    */
  var adminAccountId: string = js.native
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.native
}
object EnableOrganizationAdminAccountRequest {
  
  @scala.inline
  def apply(adminAccountId: string): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit class EnableOrganizationAdminAccountRequestMutableBuilder[Self <: EnableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: string): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
