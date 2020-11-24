package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductPlanDetails extends js.Object {
  
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
  implicit class ProvisionedProductPlanDetailsOps[Self <: ProvisionedProductPlanDetails] (val x: Self) extends AnyVal {
    
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
    def setCreatedTime(value: CreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = this.set("NotificationArns", js.Array(value :_*))
    
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = this.set("NotificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationArns: Self = this.set("NotificationArns", js.undefined)
    
    @scala.inline
    def setPathId(value: Id): Self = this.set("PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathId: Self = this.set("PathId", js.undefined)
    
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
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
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
    
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = this.set("ProvisioningParameters", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = this.set("ProvisioningParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningParameters: Self = this.set("ProvisioningParameters", js.undefined)
    
    @scala.inline
    def setStatus(value: ProvisionedProductPlanStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTime): Self = this.set("UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTime: Self = this.set("UpdatedTime", js.undefined)
  }
}
