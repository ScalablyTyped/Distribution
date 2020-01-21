package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The product view aggregations.
    */
  var ProductViewAggregations: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewAggregations] = js.native
  /**
    * Information about the product views.
    */
  var ProductViewSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummaries] = js.native
}

object SearchProductsOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProductViewAggregations: ProductViewAggregations = null,
    ProductViewSummaries: ProductViewSummaries = null
  ): SearchProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProductViewAggregations != null) __obj.updateDynamic("ProductViewAggregations")(ProductViewAggregations.asInstanceOf[js.Any])
    if (ProductViewSummaries != null) __obj.updateDynamic("ProductViewSummaries")(ProductViewSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProductsOutput]
  }
}

