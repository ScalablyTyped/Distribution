package typings.cesium.anon

import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeColor extends StObject {
  
  var edgeColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var edgeWidth: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var planes: js.UndefOr[js.Array[ClippingPlane]] = js.undefined
  
  var unionClippingRegions: js.UndefOr[Boolean] = js.undefined
}
object EdgeColor {
  
  inline def apply(): EdgeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeColor]
  }
  
  extension [Self <: EdgeColor](x: Self) {
    
    inline def setEdgeColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
    
    inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    inline def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setPlanes(value: js.Array[ClippingPlane]): Self = StObject.set(x, "planes", value.asInstanceOf[js.Any])
    
    inline def setPlanesUndefined: Self = StObject.set(x, "planes", js.undefined)
    
    inline def setPlanesVarargs(value: ClippingPlane*): Self = StObject.set(x, "planes", js.Array(value :_*))
    
    inline def setUnionClippingRegions(value: Boolean): Self = StObject.set(x, "unionClippingRegions", value.asInstanceOf[js.Any])
    
    inline def setUnionClippingRegionsUndefined: Self = StObject.set(x, "unionClippingRegions", js.undefined)
  }
}
