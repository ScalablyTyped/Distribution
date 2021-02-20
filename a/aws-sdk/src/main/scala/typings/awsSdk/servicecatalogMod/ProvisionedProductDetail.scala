package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductDetail extends StObject {
  
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
  var Id: js.UndefOr[ProvisionedProductId] = js.native
  
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
  var LastRecordId: js.UndefOr[LastRequestId] = js.native
  
  /**
    * The record identifier of the last successful request performed on this provisioned product of the following types:    ProvisionedProduct     UpdateProvisionedProduct     ExecuteProvisionedProductPlan     TerminateProvisionedProduct   
    */
  var LastSuccessfulProvisioningRecordId: js.UndefOr[Id] = js.native
  
  /**
    * The ARN of the launch role associated with the provisioned product.
    */
  var LaunchRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.native
  
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.native
  
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.native
}
object ProvisionedProductDetail {
  
  @scala.inline
  def apply(): ProvisionedProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductDetail]
  }
  
  @scala.inline
  implicit class ProvisionedProductDetailMutableBuilder[Self <: ProvisionedProductDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setId(value: ProvisionedProductId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
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
    def setLastRecordId(value: LastRequestId): Self = StObject.set(x, "LastRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRecordIdUndefined: Self = StObject.set(x, "LastRecordId", js.undefined)
    
    @scala.inline
    def setLastSuccessfulProvisioningRecordId(value: Id): Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulProvisioningRecordIdUndefined: Self = StObject.set(x, "LastSuccessfulProvisioningRecordId", js.undefined)
    
    @scala.inline
    def setLaunchRoleArn(value: RoleArn): Self = StObject.set(x, "LaunchRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchRoleArnUndefined: Self = StObject.set(x, "LaunchRoleArn", js.undefined)
    
    @scala.inline
    def setName(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setStatus(value: ProvisionedProductStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: ProvisionedProductStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: ProvisionedProductType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
