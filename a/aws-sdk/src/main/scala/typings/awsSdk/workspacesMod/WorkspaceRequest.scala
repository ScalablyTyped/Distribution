package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceRequest extends StObject {
  
  /**
    * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
    */
  var BundleId: typings.awsSdk.workspacesMod.BundleId
  
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The tags for the WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the AWS Directory Service directory for the WorkSpace.
    */
  var UserName: typings.awsSdk.workspacesMod.UserName
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsSdk.workspacesMod.VolumeEncryptionKey] = js.undefined
  
  /**
    * The WorkSpace properties.
    */
  var WorkspaceProperties: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceProperties] = js.undefined
}
object WorkspaceRequest {
  
  inline def apply(BundleId: BundleId, DirectoryId: DirectoryId, UserName: UserName): WorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceRequest]
  }
  
  extension [Self <: WorkspaceRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "RootVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "RootVolumeEncryptionEnabled", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserVolumeEncryptionEnabled(value: BooleanObject): Self = StObject.set(x, "UserVolumeEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserVolumeEncryptionEnabledUndefined: Self = StObject.set(x, "UserVolumeEncryptionEnabled", js.undefined)
    
    inline def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = StObject.set(x, "VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "VolumeEncryptionKey", js.undefined)
    
    inline def setWorkspaceProperties(value: WorkspaceProperties): Self = StObject.set(x, "WorkspaceProperties", value.asInstanceOf[js.Any])
    
    inline def setWorkspacePropertiesUndefined: Self = StObject.set(x, "WorkspaceProperties", js.undefined)
  }
}
