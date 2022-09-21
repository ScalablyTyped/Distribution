package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the account to designate as the Detective administrator account for the organization.
    */
  var AccountId: typings.awsSdk.detectiveMod.AccountId
}
object EnableOrganizationAdminAccountRequest {
  
  inline def apply(AccountId: AccountId): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  extension [Self <: EnableOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
