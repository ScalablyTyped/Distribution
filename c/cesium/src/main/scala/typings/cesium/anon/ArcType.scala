package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcType extends StObject {
  
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.native
  
  var colors: js.UndefOr[js.Array[typings.cesium.mod.Color]] = js.native
  
  var colorsPerVertex: js.UndefOr[Boolean] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var positions: js.Array[Cartesian3] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ArcType {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): ArcType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcType]
  }
  
  @scala.inline
  implicit class ArcTypeMutableBuilder[Self <: ArcType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcType(value: typings.cesium.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[typings.cesium.mod.Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsPerVertex(value: Boolean): Self = StObject.set(x, "colorsPerVertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsPerVertexUndefined: Self = StObject.set(x, "colorsPerVertex", js.undefined)
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.cesium.mod.Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
