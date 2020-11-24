package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordDetail extends js.Object {
  
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
  implicit class RecordDetailOps[Self <: RecordDetail] (val x: Self) extends AnyVal {
    
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
    def setLaunchRoleArn(value: RoleArn): Self = this.set("LaunchRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchRoleArn: Self = this.set("LaunchRoleArn", js.undefined)
    
    @scala.inline
    def setPathId(value: Id): Self = this.set("PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathId: Self = this.set("PathId", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = this.set("ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductId: Self = this.set("ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductName: Self = this.set("ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setProvisionedProductType(value: ProvisionedProductType): Self = this.set("ProvisionedProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductType: Self = this.set("ProvisionedProductType", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setRecordErrorsVarargs(value: RecordError*): Self = this.set("RecordErrors", js.Array(value :_*))
    
    @scala.inline
    def setRecordErrors(value: RecordErrors): Self = this.set("RecordErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordErrors: Self = this.set("RecordErrors", js.undefined)
    
    @scala.inline
    def setRecordId(value: Id): Self = this.set("RecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordId: Self = this.set("RecordId", js.undefined)
    
    @scala.inline
    def setRecordTagsVarargs(value: RecordTag*): Self = this.set("RecordTags", js.Array(value :_*))
    
    @scala.inline
    def setRecordTags(value: RecordTags): Self = this.set("RecordTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordTags: Self = this.set("RecordTags", js.undefined)
    
    @scala.inline
    def setRecordType(value: RecordType): Self = this.set("RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordType: Self = this.set("RecordType", js.undefined)
    
    @scala.inline
    def setStatus(value: RecordStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTime): Self = this.set("UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTime: Self = this.set("UpdatedTime", js.undefined)
  }
}
