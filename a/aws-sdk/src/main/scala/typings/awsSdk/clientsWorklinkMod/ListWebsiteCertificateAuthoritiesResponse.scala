package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebsiteCertificateAuthoritiesResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
  
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.undefined
}
object ListWebsiteCertificateAuthoritiesResponse {
  
  inline def apply(): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
  
  extension [Self <: ListWebsiteCertificateAuthoritiesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWebsiteCertificateAuthorities(value: WebsiteCaSummaryList): Self = StObject.set(x, "WebsiteCertificateAuthorities", value.asInstanceOf[js.Any])
    
    inline def setWebsiteCertificateAuthoritiesUndefined: Self = StObject.set(x, "WebsiteCertificateAuthorities", js.undefined)
    
    inline def setWebsiteCertificateAuthoritiesVarargs(value: WebsiteCaSummary*): Self = StObject.set(x, "WebsiteCertificateAuthorities", js.Array(value*))
  }
}
