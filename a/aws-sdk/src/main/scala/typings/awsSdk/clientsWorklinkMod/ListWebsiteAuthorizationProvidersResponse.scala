package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebsiteAuthorizationProvidersResponse extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
  
  /**
    * The website authorization providers.
    */
  var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.undefined
}
object ListWebsiteAuthorizationProvidersResponse {
  
  inline def apply(): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
  
  extension [Self <: ListWebsiteAuthorizationProvidersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWebsiteAuthorizationProviders(value: WebsiteAuthorizationProvidersSummaryList): Self = StObject.set(x, "WebsiteAuthorizationProviders", value.asInstanceOf[js.Any])
    
    inline def setWebsiteAuthorizationProvidersUndefined: Self = StObject.set(x, "WebsiteAuthorizationProviders", js.undefined)
    
    inline def setWebsiteAuthorizationProvidersVarargs(value: WebsiteAuthorizationProviderSummary*): Self = StObject.set(x, "WebsiteAuthorizationProviders", js.Array(value*))
  }
}
