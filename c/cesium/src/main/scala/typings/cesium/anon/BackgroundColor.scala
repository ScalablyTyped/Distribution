package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.LabelStyle
import typings.cesium.mod.Property
import typings.cesium.mod.VerticalOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[Property] = js.native
  var backgroundPadding: js.UndefOr[Property] = js.native
  var disableDepthTestDistance: js.UndefOr[Property | Double] = js.native
  var distanceDisplayCondition: js.UndefOr[typings.cesium.mod.DistanceDisplayCondition | Property] = js.native
  var eyeOffset: js.UndefOr[Property] = js.native
  var fillColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var font: js.UndefOr[String] = js.native
  var heightReference: js.UndefOr[Property] = js.native
  var horizontalOrigin: js.UndefOr[Property] = js.native
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Double] = js.native
  var pixelOffset: js.UndefOr[Cartesian2 | Property] = js.native
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  var scale: js.UndefOr[Property] = js.native
  var scaleByDistance: js.UndefOr[Property] = js.native
  var show: js.UndefOr[Property] = js.native
  var showBackground: js.UndefOr[Property] = js.native
  var style: js.UndefOr[LabelStyle | Property] = js.native
  var text: js.UndefOr[Property | String] = js.native
  var translucencyByDistance: js.UndefOr[Property] = js.native
  var verticalOrigin: js.UndefOr[VerticalOrigin | Property] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: Property): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundPadding(value: Property): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPadding: Self = this.set("backgroundPadding", js.undefined)
    @scala.inline
    def setDisableDepthTestDistance(value: Property | Double): Self = this.set("disableDepthTestDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDepthTestDistance: Self = this.set("disableDepthTestDistance", js.undefined)
    @scala.inline
    def setDistanceDisplayCondition(value: typings.cesium.mod.DistanceDisplayCondition | Property): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    @scala.inline
    def setEyeOffset(value: Property): Self = this.set("eyeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEyeOffset: Self = this.set("eyeOffset", js.undefined)
    @scala.inline
    def setFillColor(value: typings.cesium.mod.Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHeightReference(value: Property): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    @scala.inline
    def setHorizontalOrigin(value: Property): Self = this.set("horizontalOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalOrigin: Self = this.set("horizontalOrigin", js.undefined)
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineWidth(value: Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    @scala.inline
    def setPixelOffset(value: Cartesian2 | Property): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    @scala.inline
    def setPixelOffsetScaleByDistance(value: Property): Self = this.set("pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffsetScaleByDistance: Self = this.set("pixelOffsetScaleByDistance", js.undefined)
    @scala.inline
    def setScale(value: Property): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleByDistance(value: Property): Self = this.set("scaleByDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleByDistance: Self = this.set("scaleByDistance", js.undefined)
    @scala.inline
    def setShow(value: Property): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowBackground(value: Property): Self = this.set("showBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackground: Self = this.set("showBackground", js.undefined)
    @scala.inline
    def setStyle(value: LabelStyle | Property): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: Property | String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTranslucencyByDistance(value: Property): Self = this.set("translucencyByDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucencyByDistance: Self = this.set("translucencyByDistance", js.undefined)
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin | Property): Self = this.set("verticalOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOrigin: Self = this.set("verticalOrigin", js.undefined)
  }
  
}

