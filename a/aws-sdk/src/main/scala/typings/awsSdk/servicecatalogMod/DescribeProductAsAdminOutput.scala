package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductAsAdminOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  /**
    * Information about the provisioning artifacts (also known as versions) for the specified product.
    */
  var ProvisioningArtifactSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactSummaries] = js.native
  /**
    * Information about the TagOptions associated with the product.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.native
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object DescribeProductAsAdminOutput {
  @scala.inline
  def apply(
    Budgets: Budgets = null,
    ProductViewDetail: ProductViewDetail = null,
    ProvisioningArtifactSummaries: ProvisioningArtifactSummaries = null,
    TagOptions: TagOptionDetails = null,
    Tags: Tags = null
  ): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets.asInstanceOf[js.Any])
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail.asInstanceOf[js.Any])
    if (ProvisioningArtifactSummaries != null) __obj.updateDynamic("ProvisioningArtifactSummaries")(ProvisioningArtifactSummaries.asInstanceOf[js.Any])
    if (TagOptions != null) __obj.updateDynamic("TagOptions")(TagOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
}

