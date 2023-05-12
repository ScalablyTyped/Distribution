package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeMaterialBlock
import typings.babylonjs.BABYLON.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValidation extends StObject {
  
  /** the onPreviewCommandActivated observer of the preview manager should be triggered */
  var activatePreviewCommand: js.UndefOr[Boolean] = js.undefined
  
  /** a callback to trigger */
  var callback: js.UndefOr[
    js.Function2[/* scene */ Scene, /* block */ NodeMaterialBlock, js.UndefOr[Boolean | Unit]]
  ] = js.undefined
  
  /** a callback to validate the property. Returns true if the property is ok, else false. If false, the rebuild/update/callback events won't be called */
  var onValidation: js.UndefOr[js.Function2[/* block */ NodeMaterialBlock, /* propertyName */ String, Boolean]] = js.undefined
  
  /** the material should be rebuilt */
  var rebuild: js.UndefOr[Boolean] = js.undefined
  
  /** the preview should be updated */
  var update: js.UndefOr[Boolean] = js.undefined
}
object OnValidation {
  
  inline def apply(): OnValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnValidation] (val x: Self) extends AnyVal {
    
    inline def setActivatePreviewCommand(value: Boolean): Self = StObject.set(x, "activatePreviewCommand", value.asInstanceOf[js.Any])
    
    inline def setActivatePreviewCommandUndefined: Self = StObject.set(x, "activatePreviewCommand", js.undefined)
    
    inline def setCallback(value: (/* scene */ Scene, /* block */ NodeMaterialBlock) => js.UndefOr[Boolean | Unit]): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setOnValidation(value: (/* block */ NodeMaterialBlock, /* propertyName */ String) => Boolean): Self = StObject.set(x, "onValidation", js.Any.fromFunction2(value))
    
    inline def setOnValidationUndefined: Self = StObject.set(x, "onValidation", js.undefined)
    
    inline def setRebuild(value: Boolean): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
