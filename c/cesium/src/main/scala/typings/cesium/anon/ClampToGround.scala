package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClampToGround extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[typings.cesium.mod.Color] = js.native
  var markerColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var markerSize: js.UndefOr[Double] = js.native
  var markerSymbol: js.UndefOr[String] = js.native
  var sourceUri: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[typings.cesium.mod.Color] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object ClampToGround {
  @scala.inline
  def apply(): ClampToGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGround]
  }
  @scala.inline
  implicit class ClampToGroundOps[Self <: ClampToGround] (val x: Self) extends AnyVal {
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
    def setClampToGround(value: Boolean): Self = this.set("clampToGround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClampToGround: Self = this.set("clampToGround", js.undefined)
    @scala.inline
    def setFill(value: typings.cesium.mod.Color): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setMarkerColor(value: typings.cesium.mod.Color): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setMarkerSymbol(value: String): Self = this.set("markerSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSymbol: Self = this.set("markerSymbol", js.undefined)
    @scala.inline
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
    @scala.inline
    def setStroke(value: typings.cesium.mod.Color): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

