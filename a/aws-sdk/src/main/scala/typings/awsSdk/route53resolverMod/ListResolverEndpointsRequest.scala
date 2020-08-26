package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverEndpointsRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.  If you submit a second or subsequent ListResolverEndpoints request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[typings.awsSdk.route53resolverMod.Filters] = js.native
  /**
    * The maximum number of resolver endpoints that you want to return in the response to a ListResolverEndpoints request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver endpoints. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * For the first ListResolverEndpoints request, omit this value. If you have more than MaxResults resolver endpoints, you can submit another ListResolverEndpoints request to get the next group of resolver endpoints. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
}

object ListResolverEndpointsRequest {
  @scala.inline
  def apply(): ListResolverEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverEndpointsRequest]
  }
  @scala.inline
  implicit class ListResolverEndpointsRequestOps[Self <: ListResolverEndpointsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

