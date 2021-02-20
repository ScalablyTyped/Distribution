package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductPlanDetails extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.CreatedTime] = js.native
  
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsSdk.servicecatalogMod.NotificationArns] = js.native
  
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  
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
  var ProductId: js.UndefOr[Id] = js.native
  
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
  
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[ProvisionedProductPlanStatus] = js.native
  
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.servicecatalogMod.StatusMessage] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
  
  /**
    * The time when the plan was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.UpdatedTime] = js.native
}
object ProvisionedProductPlanDetails {
  
  @scala.inline
  def apply(): ProvisionedProductPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanDetails]
  }
  
  @scala.inline
  implicit class ProvisionedProductPlanDetailsMutableBuilder[Self <: ProvisionedProductPlanDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = StObject.set(x, "NotificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArnsUndefined: Self = StObject.set(x, "NotificationArns", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = StObject.set(x, "NotificationArns", js.Array(value :_*))
    
    @scala.inline
    def setPathId(value: Id): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    @scala.inline
    def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "PlanId", js.undefined)
    
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "PlanName", js.undefined)
    
    @scala.inline
    def setPlanType(value: ProvisionedProductPlanType): Self = StObject.set(x, "PlanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanTypeUndefined: Self = StObject.set(x, "PlanType", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProvisionProductId(value: Id): Self = StObject.set(x, "ProvisionProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionProductIdUndefined: Self = StObject.set(x, "ProvisionProductId", js.undefined)
    
    @scala.inline
    def setProvisionProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionProductNameUndefined: Self = StObject.set(x, "ProvisionProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ProvisionedProductPlanStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTime): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
