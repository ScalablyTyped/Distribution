package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseBottom extends js.Object {
  
  var closeBottom: js.UndefOr[Boolean] = js.native
  
  var closeTop: js.UndefOr[Boolean] = js.native
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  
  var extrudedHeight: js.UndefOr[Double] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var perPositionHeight: js.UndefOr[Boolean] = js.native
  
  var positions: js.Array[Cartesian3] = js.native
  
  var stRotation: js.UndefOr[Double] = js.native
  
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}
object CloseBottom {
  
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): CloseBottom = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseBottom]
  }
  
  @scala.inline
  implicit class CloseBottomOps[Self <: CloseBottom] (val x: Self) extends AnyVal {
    
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
    def setCloseBottom(value: Boolean): Self = this.set("closeBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBottom: Self = this.set("closeBottom", js.undefined)
    
    @scala.inline
    def setCloseTop(value: Boolean): Self = this.set("closeTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTop: Self = this.set("closeTop", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Double): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPerPositionHeight(value: Boolean): Self = this.set("perPositionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPositionHeight: Self = this.set("perPositionHeight", js.undefined)
    
    @scala.inline
    def setStRotation(value: Double): Self = this.set("stRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStRotation: Self = this.set("stRotation", js.undefined)
    
    @scala.inline
    def setVertexFormat(value: VertexFormat): Self = this.set("vertexFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexFormat: Self = this.set("vertexFormat", js.undefined)
  }
}
