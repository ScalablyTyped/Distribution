package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylinePositions extends StObject {
  
  var cornerType: js.UndefOr[typings.cesium.mod.CornerType] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var polylinePositions: js.Array[Cartesian3] = js.native
  
  var shapePositions: js.Array[Cartesian2] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object PolylinePositions {
  
  @scala.inline
  def apply(polylinePositions: js.Array[Cartesian3], shapePositions: js.Array[Cartesian2]): PolylinePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylinePositions]
  }
  
  @scala.inline
  implicit class PolylinePositionsMutableBuilder[Self <: PolylinePositions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerType(value: typings.cesium.mod.CornerType): Self = StObject.set(x, "cornerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerTypeUndefined: Self = StObject.set(x, "cornerType", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setPolylinePositions(value: js.Array[Cartesian3]): Self = StObject.set(x, "polylinePositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinePositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "polylinePositions", js.Array(value :_*))
    
    @scala.inline
    def setShapePositions(value: js.Array[Cartesian2]): Self = StObject.set(x, "shapePositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePositionsVarargs(value: Cartesian2*): Self = StObject.set(x, "shapePositions", js.Array(value :_*))
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
