package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductAttribute extends js.Object {
  
  /**
    * The ARN of the provisioned product.
    */
  var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.CreatedTime] = js.native
  
  /**
    * The identifier of the provisioned product.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.servicecatalogMod.IdempotencyToken] = js.native
  
  /**
    * The record identifier of the last request performed on this provisioned product of the following types:    ProvisionedProduct     UpdateProvisionedProduct     ExecuteProvisionedProductPlan     TerminateProvisionedProduct   
    */
  var LastProvisioningRecordId: js.UndefOr[Id] = js.native
  
  /**
    * The record identifier of the last request performed on this provisioned product.
    */
  var LastRecordId: js.UndefOr[Id] = js.native
  
  /**
    * The record identifier of the last successful request performed on this provisioned product of the following types:    ProvisionedProduct     UpdateProvisionedProduct     ExecuteProvisionedProductPlan     TerminateProvisionedProduct   
    */
  var LastSuccessfulProvisioningRecordId: js.UndefOr[Id] = js.native
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  
  /**
    * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
    */
  var PhysicalId: js.UndefOr[typings.awsSdk.servicecatalogMod.PhysicalId] = js.native
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the provisioning artifact.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
  
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.native
  
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
  
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM user.
    */
  var UserArn: js.UndefOr[typings.awsSdk.servicecatalogMod.UserArn] = js.native
  
  /**
    * The ARN of the IAM user in the session. This ARN might contain a session ID.
    */
  var UserArnSession: js.UndefOr[typings.awsSdk.servicecatalogMod.UserArnSession] = js.native
}
object ProvisionedProductAttribute {
  
  @scala.inline
  def apply(): ProvisionedProductAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductAttribute]
  }
  
  @scala.inline
  implicit class ProvisionedProductAttributeOps[Self <: ProvisionedProductAttribute] (val x: Self) extends AnyVal {
    
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
    def setArn(value: ProvisionedProductNameOrArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    
    @scala.inline
    def setLastProvisioningRecordId(value: Id): Self = this.set("LastProvisioningRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastProvisioningRecordId: Self = this.set("LastProvisioningRecordId", js.undefined)
    
    @scala.inline
    def setLastRecordId(value: Id): Self = this.set("LastRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRecordId: Self = this.set("LastRecordId", js.undefined)
    
    @scala.inline
    def setLastSuccessfulProvisioningRecordId(value: Id): Self = this.set("LastSuccessfulProvisioningRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulProvisioningRecordId: Self = this.set("LastSuccessfulProvisioningRecordId", js.undefined)
    
    @scala.inline
    def setName(value: ProvisionedProductNameOrArn): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPhysicalId(value: PhysicalId): Self = this.set("PhysicalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalId: Self = this.set("PhysicalId", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
    @scala.inline
    def setProductName(value: ProductViewName): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = this.set("ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactName: Self = this.set("ProvisioningArtifactName", js.undefined)
    
    @scala.inline
    def setStatus(value: ProvisionedProductStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ProvisionedProductStatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: ProvisionedProductType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
    
    @scala.inline
    def setUserArnSession(value: UserArnSession): Self = this.set("UserArnSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArnSession: Self = this.set("UserArnSession", js.undefined)
  }
}
