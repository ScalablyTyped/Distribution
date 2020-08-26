package typings.cesium.anon

import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableDepthTestDistance extends js.Object {
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  var disableDepthTestDistance: js.UndefOr[Property] = js.native
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var heightReference: js.UndefOr[HeightReference] = js.native
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Double] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
  var scaleByDistance: js.UndefOr[Property] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var translucencyByDistance: js.UndefOr[Property] = js.native
}

object DisableDepthTestDistance {
  @scala.inline
  def apply(): DisableDepthTestDistance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableDepthTestDistance]
  }
  @scala.inline
  implicit class DisableDepthTestDistanceOps[Self <: DisableDepthTestDistance] (val x: Self) extends AnyVal {
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
    def setColor(value: typings.cesium.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisableDepthTestDistance(value: Property): Self = this.set("disableDepthTestDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDepthTestDistance: Self = this.set("disableDepthTestDistance", js.undefined)
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    @scala.inline
    def setHeightReference(value: HeightReference): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineWidth(value: Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
    @scala.inline
    def setScaleByDistance(value: Property): Self = this.set("scaleByDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleByDistance: Self = this.set("scaleByDistance", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTranslucencyByDistance(value: Property): Self = this.set("translucencyByDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucencyByDistance: Self = this.set("translucencyByDistance", js.undefined)
  }
  
}

