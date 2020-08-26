package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsRequest extends js.Object {
  /**
    * For an initial request for a list of domains, omit this element. If the number of domains that are associated with the current AWS account is greater than the value that you specified for MaxItems, you can use Marker to return additional domains. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element. Constraints: The marker must match the value specified in the previous request.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
}

object ListDomainsRequest {
  @scala.inline
  def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  @scala.inline
  implicit class ListDomainsRequestOps[Self <: ListDomainsRequest] (val x: Self) extends AnyVal {
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
    def setMarker(value: PageMarker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
  
}

