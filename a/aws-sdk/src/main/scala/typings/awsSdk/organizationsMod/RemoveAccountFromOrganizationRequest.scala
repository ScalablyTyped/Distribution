package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAccountFromOrganizationRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the member account that you want to remove from the organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId = js.native
}
object RemoveAccountFromOrganizationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): RemoveAccountFromOrganizationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAccountFromOrganizationRequest]
  }
  
  @scala.inline
  implicit class RemoveAccountFromOrganizationRequestMutableBuilder[Self <: RemoveAccountFromOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
