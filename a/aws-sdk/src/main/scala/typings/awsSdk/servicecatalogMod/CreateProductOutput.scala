package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProductOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object CreateProductOutput {
  @scala.inline
  def apply(
    ProductViewDetail: ProductViewDetail = null,
    ProvisioningArtifactDetail: ProvisioningArtifactDetail = null,
    Tags: Tags = null
  ): CreateProductOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail.asInstanceOf[js.Any])
    if (ProvisioningArtifactDetail != null) __obj.updateDynamic("ProvisioningArtifactDetail")(ProvisioningArtifactDetail.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductOutput]
  }
}

