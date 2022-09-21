package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityProvidersResponse extends StObject {
  
  /**
    * Metadata that describes the list identity providers operation.
    */
  var IdentityProviderSummaries: IdentityProviderSummaryList
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityProvidersResponse {
  
  inline def apply(IdentityProviderSummaries: IdentityProviderSummaryList): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(IdentityProviderSummaries = IdentityProviderSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  
  extension [Self <: ListIdentityProvidersResponse](x: Self) {
    
    inline def setIdentityProviderSummaries(value: IdentityProviderSummaryList): Self = StObject.set(x, "IdentityProviderSummaries", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderSummariesVarargs(value: IdentityProviderSummary*): Self = StObject.set(x, "IdentityProviderSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
