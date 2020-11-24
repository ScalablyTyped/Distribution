package typings.cesium.mod

import typings.cesium.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillboardOptions extends js.Object {
  
  var alignedAxis: js.UndefOr[Cartesian3] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.native
  
  var eyeOffset: js.UndefOr[Cartesian3] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var heightReference: js.UndefOr[HeightReference] = js.native
  
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback] = js.native
  
  var imageSubRegion: js.UndefOr[BoundingRectangle] = js.native
  
  var pixelOffset: js.UndefOr[Cartesian2] = js.native
  
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var position: js.UndefOr[Cartesian3] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var scaleByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var sizeInMeters: js.UndefOr[Boolean] = js.native
  
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BillboardOptions {
  
  @scala.inline
  def apply(): BillboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillboardOptions]
  }
  
  @scala.inline
  implicit class BillboardOptionsOps[Self <: BillboardOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignedAxis(value: Cartesian3): Self = this.set("alignedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignedAxis: Self = this.set("alignedAxis", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = this.set("distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceDisplayCondition: Self = this.set("distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Cartesian3): Self = this.set("eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEyeOffset: Self = this.set("eyeOffset", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: HorizontalOrigin): Self = this.set("horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrigin: Self = this.set("horizontalOrigin", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageFunction1(
      value: /* id */ String => HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
    ): Self = this.set("image", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImage(value: HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageSubRegion(value: BoundingRectangle): Self = this.set("imageSubRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSubRegion: Self = this.set("imageSubRegion", js.undefined)
    
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
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScaleByDistance(value: NearFarScalar): Self = this.set("scaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleByDistance: Self = this.set("scaleByDistance", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSizeInMeters(value: Boolean): Self = this.set("sizeInMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInMeters: Self = this.set("sizeInMeters", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: NearFarScalar): Self = this.set("translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucencyByDistance: Self = this.set("translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin): Self = this.set("verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrigin: Self = this.set("verticalOrigin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
