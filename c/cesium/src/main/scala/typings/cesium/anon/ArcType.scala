package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcType extends StObject {
  
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.undefined
  
  var colors: js.UndefOr[js.Array[typings.cesium.mod.Color]] = js.undefined
  
  var colorsPerVertex: js.UndefOr[Boolean] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var granularity: js.UndefOr[Double] = js.undefined
  
  var positions: js.Array[Cartesian3]
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ArcType {
  
  inline def apply(positions: js.Array[Cartesian3]): ArcType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcType]
  }
  
  extension [Self <: ArcType](x: Self) {
    
    inline def setArcType(value: typings.cesium.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    inline def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    inline def setColors(value: js.Array[typings.cesium.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsPerVertex(value: Boolean): Self = StObject.set(x, "colorsPerVertex", value.asInstanceOf[js.Any])
    
    inline def setColorsPerVertexUndefined: Self = StObject.set(x, "colorsPerVertex", js.undefined)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: typings.cesium.mod.Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    inline def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
