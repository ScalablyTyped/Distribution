package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsResponse extends StObject {
  
  /**
    * The list of Detective administrator accounts.
    */
  var Administrators: js.UndefOr[AdministratorList] = js.undefined
  
  /**
    * If there are more accounts remaining in the results, then this is the pagination token to use to request the next page of accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListOrganizationAdminAccountsResponse {
  
  inline def apply(): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
  
  extension [Self <: ListOrganizationAdminAccountsResponse](x: Self) {
    
    inline def setAdministrators(value: AdministratorList): Self = StObject.set(x, "Administrators", value.asInstanceOf[js.Any])
    
    inline def setAdministratorsUndefined: Self = StObject.set(x, "Administrators", js.undefined)
    
    inline def setAdministratorsVarargs(value: Administrator*): Self = StObject.set(x, "Administrators", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
