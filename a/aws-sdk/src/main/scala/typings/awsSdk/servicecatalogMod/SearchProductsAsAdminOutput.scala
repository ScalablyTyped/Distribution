package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProductsAsAdminOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the product views.
    */
  var ProductViewDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetails] = js.native
}

object SearchProductsAsAdminOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProductViewDetails: ProductViewDetails = null): SearchProductsAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProductViewDetails != null) __obj.updateDynamic("ProductViewDetails")(ProductViewDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProductsAsAdminOutput]
  }
}

