package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductsRequest extends js.Object {
  /**
    * The list of filters that limit the returned products. only products that match all filters are returned.
    */
  var Filters: js.UndefOr[typings.awsSdk.pricingMod.Filters] = js.native
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The code for the service whose products you want to retrieve. 
    */
  var ServiceCode: js.UndefOr[String] = js.native
}

object GetProductsRequest {
  @scala.inline
  def apply(): GetProductsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProductsRequest]
  }
  @scala.inline
  implicit class GetProductsRequestOps[Self <: GetProductsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setFormatVersion(value: String): Self = this.set("FormatVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatVersion: Self = this.set("FormatVersion", js.undefined)
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setServiceCode(value: String): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
  }
  
}

