package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.native
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typings.awsSdk.servicecatalogMod.TotalResultsCount] = js.native
}

object SearchProvisionedProductsOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProvisionedProducts: ProvisionedProductAttributes = null,
    TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined
  ): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisionedProducts != null) __obj.updateDynamic("ProvisionedProducts")(ProvisionedProducts.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalResultsCount)) __obj.updateDynamic("TotalResultsCount")(TotalResultsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
}

