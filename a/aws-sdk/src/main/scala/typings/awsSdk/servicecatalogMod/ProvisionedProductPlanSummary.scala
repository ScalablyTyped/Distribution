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
  def apply(): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
  @scala.inline
  implicit class ProvisionedProductPlanSummaryOps[Self <: ProvisionedProductPlanSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlanId(value: Id): Self = this.set("PlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanId: Self = this.set("PlanId", js.undefined)
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = this.set("PlanName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanName: Self = this.set("PlanName", js.undefined)
    @scala.inline
    def setPlanType(value: ProvisionedProductPlanType): Self = this.set("PlanType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanType: Self = this.set("PlanType", js.undefined)
    @scala.inline
    def setProvisionProductId(value: Id): Self = this.set("ProvisionProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionProductId: Self = this.set("ProvisionProductId", js.undefined)
    @scala.inline
    def setProvisionProductName(value: ProvisionedProductName): Self = this.set("ProvisionProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionProductName: Self = this.set("ProvisionProductName", js.undefined)
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
  }
  
}

