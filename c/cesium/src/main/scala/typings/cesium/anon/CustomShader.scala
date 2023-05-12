package typings.cesium.anon

import typings.cesium.mod.Matrix4
import typings.cesium.mod.VoxelProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomShader extends StObject {
  
  var clock: js.UndefOr[typings.cesium.mod.Clock] = js.undefined
  
  var customShader: js.UndefOr[typings.cesium.mod.CustomShader] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var provider: js.UndefOr[VoxelProvider] = js.undefined
}
object CustomShader {
  
  inline def apply(): CustomShader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomShader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomShader] (val x: Self) extends AnyVal {
    
    inline def setClock(value: typings.cesium.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
    
    inline def setCustomShader(value: typings.cesium.mod.CustomShader): Self = StObject.set(x, "customShader", value.asInstanceOf[js.Any])
    
    inline def setCustomShaderUndefined: Self = StObject.set(x, "customShader", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setProvider(value: VoxelProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
