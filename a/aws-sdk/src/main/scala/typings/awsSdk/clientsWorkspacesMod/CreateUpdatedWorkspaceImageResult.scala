package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUpdatedWorkspaceImageResult extends StObject {
  
  /**
    * The identifier of the new updated WorkSpace image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
}
object CreateUpdatedWorkspaceImageResult {
  
  inline def apply(): CreateUpdatedWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUpdatedWorkspaceImageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUpdatedWorkspaceImageResult] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
