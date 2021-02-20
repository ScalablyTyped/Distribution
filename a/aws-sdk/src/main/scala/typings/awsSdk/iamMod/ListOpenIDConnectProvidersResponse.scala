package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOpenIDConnectProvidersResponse extends StObject {
  
  /**
    * The list of IAM OIDC provider resource objects defined in the AWS account.
    */
  var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.native
}
object ListOpenIDConnectProvidersResponse {
  
  @scala.inline
  def apply(): ListOpenIDConnectProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
  }
  
  @scala.inline
  implicit class ListOpenIDConnectProvidersResponseMutableBuilder[Self <: ListOpenIDConnectProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenIDConnectProviderList(value: OpenIDConnectProviderListType): Self = StObject.set(x, "OpenIDConnectProviderList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDConnectProviderListUndefined: Self = StObject.set(x, "OpenIDConnectProviderList", js.undefined)
    
    @scala.inline
    def setOpenIDConnectProviderListVarargs(value: OpenIDConnectProviderListEntry*): Self = StObject.set(x, "OpenIDConnectProviderList", js.Array(value :_*))
  }
}
