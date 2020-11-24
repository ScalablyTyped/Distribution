package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisionedProductPlanOutput extends js.Object {
  
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.native
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductName] = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
}
object CreateProvisionedProductPlanOutput {
  
  @scala.inline
  def apply(): CreateProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
  }
  
  @scala.inline
  implicit class CreateProvisionedProductPlanOutputOps[Self <: CreateProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    
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
    def setProvisionProductId(value: Id): Self = this.set("ProvisionProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionProductId: Self = this.set("ProvisionProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductName: Self = this.set("ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
  }
}
