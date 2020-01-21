package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductViewOutput extends js.Object {
  /**
    * Summary information about the product.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about the provisioning artifacts for the product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}

object DescribeProductViewOutput {
  @scala.inline
  def apply(ProductViewSummary: ProductViewSummary = null, ProvisioningArtifacts: ProvisioningArtifacts = null): DescribeProductViewOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary.asInstanceOf[js.Any])
    if (ProvisioningArtifacts != null) __obj.updateDynamic("ProvisioningArtifacts")(ProvisioningArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductViewOutput]
  }
}

