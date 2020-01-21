package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductPlanSummary extends js.Object {
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.native
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.native
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.native
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
}

object ProvisionedProductPlanSummary {
  @scala.inline
  def apply(
    PlanId: Id = null,
    PlanName: ProvisionedProductPlanName = null,
    PlanType: ProvisionedProductPlanType = null,
    ProvisionProductId: Id = null,
    ProvisionProductName: ProvisionedProductName = null,
    ProvisioningArtifactId: Id = null
  ): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    if (PlanId != null) __obj.updateDynamic("PlanId")(PlanId.asInstanceOf[js.Any])
    if (PlanName != null) __obj.updateDynamic("PlanName")(PlanName.asInstanceOf[js.Any])
    if (PlanType != null) __obj.updateDynamic("PlanType")(PlanType.asInstanceOf[js.Any])
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId.asInstanceOf[js.Any])
    if (ProvisionProductName != null) __obj.updateDynamic("ProvisionProductName")(ProvisionProductName.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
}

