package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeMaterialEditorOptions extends StObject {
  
  /** Define the URl to load node editor script */
  var editorURL: js.UndefOr[String] = js.undefined
}
object INodeMaterialEditorOptions {
  
  inline def apply(): INodeMaterialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeMaterialEditorOptions]
  }
  
  extension [Self <: INodeMaterialEditorOptions](x: Self) {
    
    inline def setEditorURL(value: String): Self = StObject.set(x, "editorURL", value.asInstanceOf[js.Any])
    
    inline def setEditorURLUndefined: Self = StObject.set(x, "editorURL", js.undefined)
  }
}
