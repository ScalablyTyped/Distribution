package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportWorkspaceImageResult extends StObject {
  
  /**
    * The identifier of the WorkSpace image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
}
object ImportWorkspaceImageResult {
  
  @scala.inline
  def apply(): ImportWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportWorkspaceImageResult]
  }
  
  @scala.inline
  implicit class ImportWorkspaceImageResultMutableBuilder[Self <: ImportWorkspaceImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
