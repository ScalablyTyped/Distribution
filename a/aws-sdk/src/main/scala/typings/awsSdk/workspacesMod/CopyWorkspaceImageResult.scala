package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyWorkspaceImageResult extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
}
object CopyWorkspaceImageResult {
  
  @scala.inline
  def apply(): CopyWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyWorkspaceImageResult]
  }
  
  @scala.inline
  implicit class CopyWorkspaceImageResultMutableBuilder[Self <: CopyWorkspaceImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
