package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapePositions extends StObject {
  
  var cornerType: js.UndefOr[typings.cesium.mod.CornerType] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var polylinePositions: js.Array[Cartesian3] = js.native
  
  var shapePositions: Double = js.native
}
object ShapePositions {
  
  @scala.inline
  def apply(polylinePositions: js.Array[Cartesian3], shapePositions: Double): ShapePositions = {
    val __obj = js.Dynamic.literal(polylinePositions = polylinePositions.asInstanceOf[js.Any], shapePositions = shapePositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapePositions]
  }
  
  @scala.inline
  implicit class ShapePositionsMutableBuilder[Self <: ShapePositions] (val x: Self) extends AnyVal {
    
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
    def setShapePositions(value: Double): Self = StObject.set(x, "shapePositions", value.asInstanceOf[js.Any])
  }
}
