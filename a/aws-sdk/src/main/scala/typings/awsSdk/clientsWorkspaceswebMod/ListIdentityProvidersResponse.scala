package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityProvidersResponse extends StObject {
  
  /**
    * The identity providers.
    */
  var identityProviders: js.UndefOr[IdentityProviderList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListIdentityProvidersResponse {
  
  inline def apply(): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIdentityProvidersResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviders(value: IdentityProviderList): Self = StObject.set(x, "identityProviders", value.asInstanceOf[js.Any])
    
    inline def setIdentityProvidersUndefined: Self = StObject.set(x, "identityProviders", js.undefined)
    
    inline def setIdentityProvidersVarargs(value: IdentityProviderSummary*): Self = StObject.set(x, "identityProviders", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
