package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * A list of products, including details for each product.
    */
  var Products: ProductsList = js.native
}

object DescribeProductsResponse {
  @scala.inline
  def apply(Products: ProductsList, NextToken: NextToken = null): DescribeProductsResponse = {
    val __obj = js.Dynamic.literal(Products = Products.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductsResponse]
  }
}

