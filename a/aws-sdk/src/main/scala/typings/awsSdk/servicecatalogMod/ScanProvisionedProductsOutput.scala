package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.native
}

object ScanProvisionedProductsOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisionedProducts: ProvisionedProductDetails = null): ScanProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisionedProducts != null) __obj.updateDynamic("ProvisionedProducts")(ProvisionedProducts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanProvisionedProductsOutput]
  }
}

