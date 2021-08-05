package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugShowBoundingVolume extends StObject {
  
  var center: js.UndefOr[Cartesian3] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[js.Any] = js.undefined
  
  var material: js.UndefOr[typings.cesium.mod.Material] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var radii: js.UndefOr[Cartesian3] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object DebugShowBoundingVolume {
  
  inline def apply(): DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolume]
  }
  
  extension [Self <: DebugShowBoundingVolume](x: Self) {
    
    inline def setCenter(value: Cartesian3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    inline def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaterial(value: typings.cesium.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setRadii(value: Cartesian3): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
