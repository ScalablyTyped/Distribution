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
  def apply(FormatVersion: String = null, NextToken: String = null, PriceList: PriceList = null): GetProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PriceList != null) __obj.updateDynamic("PriceList")(PriceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductsResponse]
  }
}

