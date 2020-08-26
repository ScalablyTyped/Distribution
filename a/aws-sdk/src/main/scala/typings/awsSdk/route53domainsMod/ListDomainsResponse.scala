package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsResponse extends js.Object {
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
  implicit class ListDomainsResponseOps[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainsVarargs(value: DomainSummary*): Self = this.set("Domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: DomainSummaryList): Self = this.set("Domains", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageMarker(value: PageMarker): Self = this.set("NextPageMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageMarker: Self = this.set("NextPageMarker", js.undefined)
  }
  
}

