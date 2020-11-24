package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterWorkspaceDirectoryRequest extends js.Object {
  
  /**
    * The identifier of the directory. You cannot register a directory if it does not have a status of Active. If the directory does not have a status of Active, you will receive an InvalidResourceStateException error. If you have already registered the maximum number of directories that you can register with Amazon WorkSpaces, you will receive a ResourceLimitExceededException error. Deregister directories that you are not using for WorkSpaces, and try again.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId = js.native
  
  /**
    * Indicates whether self-service capabilities are enabled or disabled.
    */
  var EnableSelfService: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Indicates whether Amazon WorkDocs is enabled or disabled. If you have enabled this parameter and WorkDocs is not available in the Region, you will receive an OperationNotSupportedException error. Set EnableWorkDocs to disabled, and try again.
    */
  var EnableWorkDocs: BooleanObject = js.native
  
  /**
    * The identifiers of the subnets for your virtual private cloud (VPC). Make sure that the subnets are in supported Availability Zones. The subnets must also be in separate Availability Zones. If these conditions are not met, you will receive an OperationNotSupportedException error.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.workspacesMod.SubnetIds] = js.native
  
  /**
    * The tags associated with the directory.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates whether your WorkSpace directory is dedicated or shared. To use Bring Your Own License (BYOL) images, this value must be set to DEDICATED and your AWS account must be enabled for BYOL. If your account has not been enabled for BYOL, you will receive an InvalidParameterValuesException error. For more information about BYOL images, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.workspacesMod.Tenancy] = js.native
}
object RegisterWorkspaceDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, EnableWorkDocs: BooleanObject): RegisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], EnableWorkDocs = EnableWorkDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWorkspaceDirectoryRequest]
  }
  
  @scala.inline
  implicit class RegisterWorkspaceDirectoryRequestOps[Self <: RegisterWorkspaceDirectoryRequest] (val x: Self) extends AnyVal {
    
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWorkDocs(value: BooleanObject): Self = this.set("EnableWorkDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSelfService(value: BooleanObject): Self = this.set("EnableSelfService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSelfService: Self = this.set("EnableSelfService", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTenancy(value: Tenancy): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
  }
}
