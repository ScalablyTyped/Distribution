package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsResponse extends StObject {
  
  /**
    * A summary of domains.
    */
  var Domains: DomainSummaryList
  
  /**
    * If there are more domains than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
}
object ListDomainsResponse {
  
  inline def apply(Domains: DomainSummaryList): ListDomainsResponse = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  extension [Self <: ListDomainsResponse](x: Self) {
    
    inline def setDomains(value: DomainSummaryList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: DomainSummary*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    inline def setNextPageMarker(value: PageMarker): Self = StObject.set(x, "NextPageMarker", value.asInstanceOf[js.Any])
    
    inline def setNextPageMarkerUndefined: Self = StObject.set(x, "NextPageMarker", js.undefined)
  }
}
