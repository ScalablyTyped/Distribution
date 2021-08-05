package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyWorkspaceImageResult extends StObject {
  
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
}
object CopyWorkspaceImageResult {
  
  inline def apply(): CopyWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyWorkspaceImageResult]
  }
  
  extension [Self <: CopyWorkspaceImageResult](x: Self) {
    
    inline def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
  }
}
