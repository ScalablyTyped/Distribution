package typings.cesium.anon

import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlendOption extends StObject {
  
  var blendOption: js.UndefOr[typings.cesium.mod.BlendOption] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var scene: js.UndefOr[typings.cesium.mod.Scene] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object BlendOption {
  
  inline def apply(): BlendOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendOption]
  }
  
  extension [Self <: BlendOption](x: Self) {
    
    inline def setBlendOption(value: typings.cesium.mod.BlendOption): Self = StObject.set(x, "blendOption", value.asInstanceOf[js.Any])
    
    inline def setBlendOptionUndefined: Self = StObject.set(x, "blendOption", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
