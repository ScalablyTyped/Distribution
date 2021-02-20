package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductAttribute extends StObject {
  
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
  implicit class ProvisionedProductAttributeMutableBuilder[Self <: ProvisionedProductAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setLastProvisioningRecordId(value: Id): Self = StObject.set(x, "LastProvisioningRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastProvisioningRecordIdUndefined: Self = StObject.set(x, "LastProvisioningRecordId", js.undefined)
    
    @scala.inline
    def setLastRecordId(value: Id): Self = StObject.set(x, "LastRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRecordIdUndefined: Self = StObject.set(x, "LastRecordId", js.undefined)
    
    @scala.inline
    def setLastSuccessfulProvisioningRecordId(value: Id): Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulProvisioningRecordIdUndefined: Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", js.undefined)
    
    @scala.inline
    def setName(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPhysicalId(value: PhysicalId): Self = StObject.set(x, "PhysicalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalIdUndefined: Self = StObject.set(x, "PhysicalId", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProductName(value: ProductViewName): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = StObject.set(x, "ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactNameUndefined: Self = StObject.set(x, "ProvisioningArtifactName", js.undefined)
    
    @scala.inline
    def setStatus(value: ProvisionedProductStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: ProvisionedProductStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
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
    def setType(value: ProvisionedProductType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnSession(value: UserArnSession): Self = StObject.set(x, "UserArnSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnSessionUndefined: Self = StObject.set(x, "UserArnSession", js.undefined)
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
