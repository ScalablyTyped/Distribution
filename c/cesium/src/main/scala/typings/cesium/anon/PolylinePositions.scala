package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylinePositions extends js.Object {
  
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
  implicit class PolylinePositionsOps[Self <: PolylinePositions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolylinePositionsVarargs(value: Cartesian3*): Self = this.set("polylinePositions", js.Array(value :_*))
    
    @scala.inline
    def setPolylinePositions(value: js.Array[Cartesian3]): Self = this.set("polylinePositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePositionsVarargs(value: Cartesian2*): Self = this.set("shapePositions", js.Array(value :_*))
    
    @scala.inline
    def setShapePositions(value: js.Array[Cartesian2]): Self = this.set("shapePositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerType(value: typings.cesium.mod.CornerType): Self = this.set("cornerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerType: Self = this.set("cornerType", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
}
