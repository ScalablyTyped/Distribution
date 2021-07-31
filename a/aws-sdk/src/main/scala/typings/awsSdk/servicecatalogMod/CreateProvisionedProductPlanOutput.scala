package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisionedProductPlanOutput extends StObject {
  
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductName] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
}
object CreateProvisionedProductPlanOutput {
  
  @scala.inline
  def apply(): CreateProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
  }
  
  @scala.inline
  implicit class CreateProvisionedProductPlanOutputMutableBuilder[Self <: CreateProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "PlanId", js.undefined)
    
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "PlanName", js.undefined)
    
    @scala.inline
    def setProvisionProductId(value: Id): Self = StObject.set(x, "ProvisionProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionProductIdUndefined: Self = StObject.set(x, "ProvisionProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
  }
}
