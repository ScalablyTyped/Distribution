package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordDetail extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.CreatedTime] = js.undefined
  
  /**
    * The ARN of the launch role associated with the provisioned product.
    */
  var LaunchRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The path identifier.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductName] = js.undefined
  
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var ProvisionedProductType: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductType] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The errors that occurred.
    */
  var RecordErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordErrors] = js.undefined
  
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.undefined
  
  /**
    * One or more tags.
    */
  var RecordTags: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordTags] = js.undefined
  
  /**
    * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
    */
  var RecordType: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordType] = js.undefined
  
  /**
    * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
    */
  var Status: js.UndefOr[RecordStatus] = js.undefined
  
  /**
    * The time when the record was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.UpdatedTime] = js.undefined
}
object RecordDetail {
  
  inline def apply(): RecordDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordDetail]
  }
  
  extension [Self <: RecordDetail](x: Self) {
    
    inline def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLaunchRoleArn(value: RoleArn): Self = StObject.set(x, "LaunchRoleArn", value.asInstanceOf[js.Any])
    
    inline def setLaunchRoleArnUndefined: Self = StObject.set(x, "LaunchRoleArn", js.undefined)
    
    inline def setPathId(value: Id): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    inline def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    inline def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    inline def setProvisionedProductType(value: ProvisionedProductType): Self = StObject.set(x, "ProvisionedProductType", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductTypeUndefined: Self = StObject.set(x, "ProvisionedProductType", js.undefined)
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    inline def setRecordErrors(value: RecordErrors): Self = StObject.set(x, "RecordErrors", value.asInstanceOf[js.Any])
    
    inline def setRecordErrorsUndefined: Self = StObject.set(x, "RecordErrors", js.undefined)
    
    inline def setRecordErrorsVarargs(value: RecordError*): Self = StObject.set(x, "RecordErrors", js.Array(value :_*))
    
    inline def setRecordId(value: Id): Self = StObject.set(x, "RecordId", value.asInstanceOf[js.Any])
    
    inline def setRecordIdUndefined: Self = StObject.set(x, "RecordId", js.undefined)
    
    inline def setRecordTags(value: RecordTags): Self = StObject.set(x, "RecordTags", value.asInstanceOf[js.Any])
    
    inline def setRecordTagsUndefined: Self = StObject.set(x, "RecordTags", js.undefined)
    
    inline def setRecordTagsVarargs(value: RecordTag*): Self = StObject.set(x, "RecordTags", js.Array(value :_*))
    
    inline def setRecordType(value: RecordType): Self = StObject.set(x, "RecordType", value.asInstanceOf[js.Any])
    
    inline def setRecordTypeUndefined: Self = StObject.set(x, "RecordType", js.undefined)
    
    inline def setStatus(value: RecordStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTime(value: UpdatedTime): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
