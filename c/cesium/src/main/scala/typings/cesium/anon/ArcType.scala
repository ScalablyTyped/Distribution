package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcType extends js.Object {
  
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
  implicit class ArcTypeOps[Self <: ArcType] (val x: Self) extends AnyVal {
    
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
    def setPositionsVarargs(value: Cartesian3*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcType(value: typings.cesium.mod.ArcType): Self = this.set("arcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArcType: Self = this.set("arcType", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: typings.cesium.mod.Color*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[typings.cesium.mod.Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColorsPerVertex(value: Boolean): Self = this.set("colorsPerVertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorsPerVertex: Self = this.set("colorsPerVertex", js.undefined)
    
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
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
