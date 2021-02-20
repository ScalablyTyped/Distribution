package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsResponse extends StObject {
  
  /**
    * A summary of domains.
    */
  var Domains: DomainSummaryList = js.native
  
  /**
    * If there are more domains than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
}
object ListDomainsResponse {
  
  @scala.inline
  def apply(Domains: DomainSummaryList): ListDomainsResponse = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  @scala.inline
  implicit class ListDomainsResponseMutableBuilder[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: DomainSummaryList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsVarargs(value: DomainSummary*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    @scala.inline
    def setNextPageMarker(value: PageMarker): Self = StObject.set(x, "NextPageMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageMarkerUndefined: Self = StObject.set(x, "NextPageMarker", js.undefined)
  }
}
