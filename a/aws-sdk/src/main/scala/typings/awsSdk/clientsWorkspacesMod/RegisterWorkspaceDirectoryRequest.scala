package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterWorkspaceDirectoryRequest extends StObject {
  
  /**
    * The identifier of the directory. You cannot register a directory if it does not have a status of Active. If the directory does not have a status of Active, you will receive an InvalidResourceStateException error. If you have already registered the maximum number of directories that you can register with Amazon WorkSpaces, you will receive a ResourceLimitExceededException error. Deregister directories that you are not using for WorkSpaces, and try again.
    */
  var DirectoryId: typings.awsSdk.clientsWorkspacesMod.DirectoryId
  
  /**
    * Indicates whether self-service capabilities are enabled or disabled.
    */
  var EnableSelfService: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Indicates whether Amazon WorkDocs is enabled or disabled. If you have enabled this parameter and WorkDocs is not available in the Region, you will receive an OperationNotSupportedException error. Set EnableWorkDocs to disabled, and try again.
    */
  var EnableWorkDocs: BooleanObject
  
  /**
    * The identifiers of the subnets for your virtual private cloud (VPC). Make sure that the subnets are in supported Availability Zones. The subnets must also be in separate Availability Zones. If these conditions are not met, you will receive an OperationNotSupportedException error.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.SubnetIds] = js.undefined
  
  /**
    * The tags associated with the directory.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates whether your WorkSpace directory is dedicated or shared. To use Bring Your Own License (BYOL) images, this value must be set to DEDICATED and your Amazon Web Services account must be enabled for BYOL. If your account has not been enabled for BYOL, you will receive an InvalidParameterValuesException error. For more information about BYOL images, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Tenancy] = js.undefined
}
object RegisterWorkspaceDirectoryRequest {
  
  inline def apply(DirectoryId: DirectoryId, EnableWorkDocs: BooleanObject): RegisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], EnableWorkDocs = EnableWorkDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWorkspaceDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterWorkspaceDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setEnableSelfService(value: BooleanObject): Self = StObject.set(x, "EnableSelfService", value.asInstanceOf[js.Any])
    
    inline def setEnableSelfServiceUndefined: Self = StObject.set(x, "EnableSelfService", js.undefined)
    
    inline def setEnableWorkDocs(value: BooleanObject): Self = StObject.set(x, "EnableWorkDocs", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
