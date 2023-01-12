package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceImagePermissionRequest extends StObject {
  
  /**
    * The permission to copy the image. This permission can be revoked only after an image has been shared.
    */
  var AllowCopyImage: BooleanObject
  
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId
  
  /**
    * The identifier of the Amazon Web Services account to share or unshare the image with.  Before sharing the image, confirm that you are sharing to the correct Amazon Web Services account ID. 
    */
  var SharedAccountId: AwsAccount
}
object UpdateWorkspaceImagePermissionRequest {
  
  inline def apply(AllowCopyImage: BooleanObject, ImageId: WorkspaceImageId, SharedAccountId: AwsAccount): UpdateWorkspaceImagePermissionRequest = {
    val __obj = js.Dynamic.literal(AllowCopyImage = AllowCopyImage.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceImagePermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkspaceImagePermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowCopyImage(value: BooleanObject): Self = StObject.set(x, "AllowCopyImage", value.asInstanceOf[js.Any])
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountId(value: AwsAccount): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
