package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * Information about the associated launch paths.
    */
  var LaunchPaths: js.UndefOr[typings.awsSdk.servicecatalogMod.LaunchPaths] = js.native
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}

object DescribeProductOutput {
  @scala.inline
  def apply(
    Budgets: Budgets = null,
    LaunchPaths: LaunchPaths = null,
    ProductViewSummary: ProductViewSummary = null,
    ProvisioningArtifacts: ProvisioningArtifacts = null
  ): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    if (Budgets != null) __obj.updateDynamic("Budgets")(Budgets.asInstanceOf[js.Any])
    if (LaunchPaths != null) __obj.updateDynamic("LaunchPaths")(LaunchPaths.asInstanceOf[js.Any])
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary.asInstanceOf[js.Any])
    if (ProvisioningArtifacts != null) __obj.updateDynamic("ProvisioningArtifacts")(ProvisioningArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductOutput]
  }
}

