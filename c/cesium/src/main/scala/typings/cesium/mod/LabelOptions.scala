package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends js.Object {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var backgroundPadding: js.UndefOr[Cartesian2] = js.native
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.native
  
  var eyeOffset: js.UndefOr[Cartesian3] = js.native
  
  var fillColor: js.UndefOr[Color] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var heightReference: js.UndefOr[HeightReference] = js.native
  
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.native
  
  var outlineColor: js.UndefOr[Color] = js.native
  
  var outlineWidth: js.UndefOr[Double] = js.native
  
  var pixelOffset: js.UndefOr[Cartesian2] = js.native
  
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var position: js.UndefOr[Cartesian3] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showBackground: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[LabelStyle] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Cartesian2): Self = this.set("backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPadding: Self = this.set("backgroundPadding", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Cartesian3): Self = this.set("eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEyeOffset: Self = this.set("eyeOffset", js.undefined)
    
    @scala.inline
    def setFillColor(value: Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: HorizontalOrigin): Self = this.set("horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrigin: Self = this.set("horizontalOrigin", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Cartesian2): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: NearFarScalar): Self = this.set("pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOffsetScaleByDistance: Self = this.set("pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setPosition(value: Cartesian3): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowBackground(value: Boolean): Self = this.set("showBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBackground: Self = this.set("showBackground", js.undefined)
    
    @scala.inline
    def setStyle(value: LabelStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: NearFarScalar): Self = this.set("translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucencyByDistance: Self = this.set("translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin): Self = this.set("verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrigin: Self = this.set("verticalOrigin", js.undefined)
  }
}
