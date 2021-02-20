package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordDetail extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.CreatedTime] = js.native
  
  /**
    * The ARN of the launch role associated with the provisioned product.
    */
  var LaunchRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The path identifier.
    */
  var PathId: js.UndefOr[Id] = js.native
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductName] = js.native
  
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var ProvisionedProductType: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductType] = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The errors that occurred.
    */
  var RecordErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordErrors] = js.native
  
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  
  /**
    * One or more tags.
    */
  var RecordTags: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordTags] = js.native
  
  /**
    * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
    */
  var RecordType: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordType] = js.native
  
  /**
    * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
    */
  var Status: js.UndefOr[RecordStatus] = js.native
  
  /**
    * The time when the record was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.UpdatedTime] = js.native
}
object RecordDetail {
  
  @scala.inline
  def apply(): RecordDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordDetail]
  }
  
  @scala.inline
  implicit class RecordDetailMutableBuilder[Self <: RecordDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setLaunchRoleArn(value: RoleArn): Self = StObject.set(x, "LaunchRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchRoleArnUndefined: Self = StObject.set(x, "LaunchRoleArn", js.undefined)
    
    @scala.inline
    def setPathId(value: Id): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setProvisionedProductType(value: ProvisionedProductType): Self = StObject.set(x, "ProvisionedProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductTypeUndefined: Self = StObject.set(x, "ProvisionedProductType", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setRecordErrors(value: RecordErrors): Self = StObject.set(x, "RecordErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordErrorsUndefined: Self = StObject.set(x, "RecordErrors", js.undefined)
    
    @scala.inline
    def setRecordErrorsVarargs(value: RecordError*): Self = StObject.set(x, "RecordErrors", js.Array(value :_*))
    
    @scala.inline
    def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
    
    @scala.inline
    def setRecordTags(value: RecordTags): Self = StObject.set(x, "RecordTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTagsUndefined: Self = StObject.set(x, "RecordTags", js.undefined)
    
    @scala.inline
    def setRecordTagsVarargs(value: RecordTag*): Self = StObject.set(x, "RecordTags", js.Array(value :_*))
    
    @scala.inline
    def setRecordType(value: RecordType): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeUndefined: Self = StObject.set(x, "RecordType", js.undefined)
    
    @scala.inline
    def setStatus(value: RecordStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTime): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
