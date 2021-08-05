package typings.cesium.anon

import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugShowBoundingVolumeModelMatrix extends StObject {
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}
object DebugShowBoundingVolumeModelMatrix {
  
  inline def apply(): DebugShowBoundingVolumeModelMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolumeModelMatrix]
  }
  
  extension [Self <: DebugShowBoundingVolumeModelMatrix](x: Self) {
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
