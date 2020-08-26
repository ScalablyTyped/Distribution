package typings.cesium.anon

import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeColor extends js.Object {
  var edgeColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var edgeWidth: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  var planes: js.UndefOr[js.Array[ClippingPlane]] = js.native
  var unionClippingRegions: js.UndefOr[Boolean] = js.native
}

object EdgeColor {
  @scala.inline
  def apply(): EdgeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeColor]
  }
  @scala.inline
  implicit class EdgeColorOps[Self <: EdgeColor] (val x: Self) extends AnyVal {
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
    def setEdgeColor(value: typings.cesium.mod.Color): Self = this.set("edgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeColor: Self = this.set("edgeColor", js.undefined)
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeWidth: Self = this.set("edgeWidth", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
    @scala.inline
    def setPlanesVarargs(value: ClippingPlane*): Self = this.set("planes", js.Array(value :_*))
    @scala.inline
    def setPlanes(value: js.Array[ClippingPlane]): Self = this.set("planes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlanes: Self = this.set("planes", js.undefined)
    @scala.inline
    def setUnionClippingRegions(value: Boolean): Self = this.set("unionClippingRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnionClippingRegions: Self = this.set("unionClippingRegions", js.undefined)
  }
  
}

