package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceBundleRequest extends StObject {
  
  /**
    * The identifier of the bundle.
    */
  var BundleId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.BundleId] = js.undefined
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
}
object UpdateWorkspaceBundleRequest {
  
  inline def apply(): UpdateWorkspaceBundleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkspaceBundleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkspaceBundleRequest] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
