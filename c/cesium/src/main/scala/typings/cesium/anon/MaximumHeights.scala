package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumHeights extends StObject {
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var maximumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var minimumHeights: js.UndefOr[js.Array[Double]] = js.undefined
  
  var positions: js.Array[Cartesian3]
  
  var vertexFormat: js.UndefOr[typings.cesium.mod.VertexFormat] = js.undefined
}
object MaximumHeights {
  
  inline def apply(positions: js.Array[Cartesian3]): MaximumHeights = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumHeights]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaximumHeights] (val x: Self) extends AnyVal {
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setMaximumHeights(value: js.Array[Double]): Self = StObject.set(x, "maximumHeights", value.asInstanceOf[js.Any])
    
    inline def setMaximumHeightsUndefined: Self = StObject.set(x, "maximumHeights", js.undefined)
    
    inline def setMaximumHeightsVarargs(value: Double*): Self = StObject.set(x, "maximumHeights", js.Array(value*))
    
    inline def setMinimumHeights(value: js.Array[Double]): Self = StObject.set(x, "minimumHeights", value.asInstanceOf[js.Any])
    
    inline def setMinimumHeightsUndefined: Self = StObject.set(x, "minimumHeights", js.undefined)
    
    inline def setMinimumHeightsVarargs(value: Double*): Self = StObject.set(x, "minimumHeights", js.Array(value*))
    
    inline def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setVertexFormat(value: typings.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
