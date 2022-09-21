package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account where you want to create the folder.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The ID of the folder.
    */
  var FolderId: RestrictiveResourceId
  
  /**
    * The type of folder. By default, folderType is SHARED.
    */
  var FolderType: js.UndefOr[typings.awsSdk.quicksightMod.FolderType] = js.undefined
  
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[FolderName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the parent folder.  ParentFolderArn can be null. An empty parentFolderArn creates a root-level folder.
    */
  var ParentFolderArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A structure that describes the principals and the resource-level permissions of a folder. To specify no permissions, omit Permissions.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * Tags for the folder.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFolderRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, FolderId: RestrictiveResourceId): CreateFolderRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderRequest]
  }
  
  extension [Self <: CreateFolderRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setFolderType(value: FolderType): Self = StObject.set(x, "FolderType", value.asInstanceOf[js.Any])
    
    inline def setFolderTypeUndefined: Self = StObject.set(x, "FolderType", js.undefined)
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParentFolderArn(value: Arn): Self = StObject.set(x, "ParentFolderArn", value.asInstanceOf[js.Any])
    
    inline def setParentFolderArnUndefined: Self = StObject.set(x, "ParentFolderArn", js.undefined)
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
