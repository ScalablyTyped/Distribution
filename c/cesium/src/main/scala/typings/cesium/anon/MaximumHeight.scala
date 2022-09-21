package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumHeight extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var maximumHeight: js.UndefOr[Double] = js.undefined
  
  var minimumHeight: js.UndefOr[Double] = js.undefined
  
  var positions: js.Array[Cartesian3]
  
  var vertexFormat: js.UndefOr[typings.cesium.mod.VertexFormat] = js.undefined
}
object MaximumHeight {
  
  inline def apply(positions: js.Array[Cartesian3]): MaximumHeight = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumHeight]
  }
  
  extension [Self <: MaximumHeight](x: Self) {
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    inline def setMaximumHeightUndefined: Self = StObject.set(x, "maximumHeight", js.undefined)
    
    inline def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimumHeightUndefined: Self = StObject.set(x, "minimumHeight", js.undefined)
    
    inline def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setVertexFormat(value: typings.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
