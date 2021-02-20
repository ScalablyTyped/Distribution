package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebsiteAuthorizationProvidersResponse extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
  
  /**
    * The website authorization providers.
    */
  var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.native
}
object ListWebsiteAuthorizationProvidersResponse {
  
  @scala.inline
  def apply(): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
  
  @scala.inline
  implicit class ListWebsiteAuthorizationProvidersResponseMutableBuilder[Self <: ListWebsiteAuthorizationProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWebsiteAuthorizationProviders(value: WebsiteAuthorizationProvidersSummaryList): Self = StObject.set(x, "WebsiteAuthorizationProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteAuthorizationProvidersUndefined: Self = StObject.set(x, "WebsiteAuthorizationProviders", js.undefined)
    
    @scala.inline
    def setWebsiteAuthorizationProvidersVarargs(value: WebsiteAuthorizationProviderSummary*): Self = StObject.set(x, "WebsiteAuthorizationProviders", js.Array(value :_*))
  }
}
