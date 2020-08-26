package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductsResponse extends js.Object {
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The list of products that match your filters. The list contains both the product metadata and the price information.
    */
  var PriceList: js.UndefOr[typings.awsSdk.pricingMod.PriceList] = js.native
}

object GetProductsResponse {
  @scala.inline
  def apply(): GetProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProductsResponse]
  }
  @scala.inline
  implicit class GetProductsResponseOps[Self <: GetProductsResponse] (val x: Self) extends AnyVal {
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
    def setFormatVersion(value: String): Self = this.set("FormatVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatVersion: Self = this.set("FormatVersion", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPriceListVarargs(value: PriceListItemJSON*): Self = this.set("PriceList", js.Array(value :_*))
    @scala.inline
    def setPriceList(value: PriceList): Self = this.set("PriceList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriceList: Self = this.set("PriceList", js.undefined)
  }
  
}

