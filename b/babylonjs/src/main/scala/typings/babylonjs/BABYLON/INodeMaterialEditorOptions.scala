package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeMaterialEditorOptions extends StObject {
  
  /** Define the URl to load node editor script */
  var editorURL: js.UndefOr[String] = js.native
}
object INodeMaterialEditorOptions {
  
  @scala.inline
  def apply(): INodeMaterialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeMaterialEditorOptions]
  }
  
  @scala.inline
  implicit class INodeMaterialEditorOptionsMutableBuilder[Self <: INodeMaterialEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorURL(value: String): Self = StObject.set(x, "editorURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorURLUndefined: Self = StObject.set(x, "editorURL", js.undefined)
  }
}
