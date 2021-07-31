package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsResponse extends StObject {
  
  /**
    * An AdminAccounts object that includes a list of accounts configured as GuardDuty delegated administrators.
    */
  var AdminAccounts: js.UndefOr[typings.awsSdk.guarddutyMod.AdminAccounts] = js.undefined
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListOrganizationAdminAccountsResponse {
  
  @scala.inline
  def apply(): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
  
  @scala.inline
  implicit class ListOrganizationAdminAccountsResponseMutableBuilder[Self <: ListOrganizationAdminAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccounts(value: AdminAccounts): Self = StObject.set(x, "AdminAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminAccountsUndefined: Self = StObject.set(x, "AdminAccounts", js.undefined)
    
    @scala.inline
    def setAdminAccountsVarargs(value: AdminAccount*): Self = StObject.set(x, "AdminAccounts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
