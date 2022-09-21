package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceBundleRequest extends StObject {
  
  /**
    * The description of the bundle.
    */
  var BundleDescription: WorkspaceBundleDescription
  
  /**
    * The name of the bundle.
    */
  var BundleName: WorkspaceBundleName
  
  var ComputeType: typings.awsSdk.workspacesMod.ComputeType
  
  /**
    * The identifier of the image that is used to create the bundle.
    */
  var ImageId: WorkspaceImageId
  
  var RootStorage: js.UndefOr[typings.awsSdk.workspacesMod.RootStorage] = js.undefined
  
  /**
    * The tags associated with the bundle.  To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM user permissions to use workspaces:CreateTags.  
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var UserStorage: typings.awsSdk.workspacesMod.UserStorage
}
object CreateWorkspaceBundleRequest {
  
  inline def apply(
    BundleDescription: WorkspaceBundleDescription,
    BundleName: WorkspaceBundleName,
    ComputeType: ComputeType,
    ImageId: WorkspaceImageId,
    UserStorage: UserStorage
  ): CreateWorkspaceBundleRequest = {
    val __obj = js.Dynamic.literal(BundleDescription = BundleDescription.asInstanceOf[js.Any], BundleName = BundleName.asInstanceOf[js.Any], ComputeType = ComputeType.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], UserStorage = UserStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceBundleRequest]
  }
  
  extension [Self <: CreateWorkspaceBundleRequest](x: Self) {
    
    inline def setBundleDescription(value: WorkspaceBundleDescription): Self = StObject.set(x, "BundleDescription", value.asInstanceOf[js.Any])
    
    inline def setBundleName(value: WorkspaceBundleName): Self = StObject.set(x, "BundleName", value.asInstanceOf[js.Any])
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "ComputeType", value.asInstanceOf[js.Any])
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setRootStorage(value: RootStorage): Self = StObject.set(x, "RootStorage", value.asInstanceOf[js.Any])
    
    inline def setRootStorageUndefined: Self = StObject.set(x, "RootStorage", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserStorage(value: UserStorage): Self = StObject.set(x, "UserStorage", value.asInstanceOf[js.Any])
  }
}
