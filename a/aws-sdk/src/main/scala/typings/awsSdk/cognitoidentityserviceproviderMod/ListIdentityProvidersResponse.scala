package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityProvidersResponse extends StObject {
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * A list of identity provider objects.
    */
  var Providers: ProvidersListType = js.native
}
object ListIdentityProvidersResponse {
  
  @scala.inline
  def apply(Providers: ProvidersListType): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  
  @scala.inline
  implicit class ListIdentityProvidersResponseMutableBuilder[Self <: ListIdentityProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProviders(value: ProvidersListType): Self = StObject.set(x, "Providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: ProviderDescription*): Self = StObject.set(x, "Providers", js.Array(value :_*))
  }
}
