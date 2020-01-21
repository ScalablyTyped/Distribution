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
  def apply(
    Filters: Filters = null,
    FormatVersion: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    ServiceCode: String = null
  ): GetProductsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductsRequest]
  }
}

