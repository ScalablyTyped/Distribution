package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignedAxis extends js.Object {
  
  var alignedAxis: js.UndefOr[Property] = js.native
  
  var color: js.UndefOr[Property] = js.native
  
  var disableDepthTestDistance: js.UndefOr[Property | Double] = js.native
  
  var eyeOffset: js.UndefOr[Property] = js.native
  
  var height: js.UndefOr[Property] = js.native
  
  var heightReference: js.UndefOr[Property] = js.native
  
  var horizontalOrigin: js.UndefOr[Property] = js.native
  
  var image: js.UndefOr[Property] = js.native
  
  var imageSubRegion: js.UndefOr[Property] = js.native
  
  var pixelOffset: js.UndefOr[Property] = js.native
  
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  
  var rotation: js.UndefOr[Property] = js.native
  
  var scale: js.UndefOr[Property] = js.native
  
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var translucencyByDistance: js.UndefOr[Property] = js.native
  
  var verticalOrigin: js.UndefOr[Property] = js.native
  
  var width: js.UndefOr[Property] = js.native
}
object AlignedAxis {
  
  @scala.inline
  def apply(): AlignedAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignedAxis]
  }
  
  @scala.inline
  implicit class AlignedAxisOps[Self <: AlignedAxis] (val x: Self) extends AnyVal {
    
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
    def setAlignedAxis(value: Property): Self = this.set("alignedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignedAxis: Self = this.set("alignedAxis", js.undefined)
    
    @scala.inline
    def setColor(value: Property): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisableDepthTestDistance(value: Property | Double): Self = this.set("disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDepthTestDistance: Self = this.set("disableDepthTestDistance", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Property): Self = this.set("eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEyeOffset: Self = this.set("eyeOffset", js.undefined)
    
    @scala.inline
    def setHeight(value: Property): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightReference(value: Property): Self = this.set("heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightReference: Self = this.set("heightReference", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: Property): Self = this.set("horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrigin: Self = this.set("horizontalOrigin", js.undefined)
    
    @scala.inline
    def setImage(value: Property): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageSubRegion(value: Property): Self = this.set("imageSubRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSubRegion: Self = this.set("imageSubRegion", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Property): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: Property): Self = this.set("pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOffsetScaleByDistance: Self = this.set("pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setRotation(value: Property): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
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
    def setTranslucencyByDistance(value: Property): Self = this.set("translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucencyByDistance: Self = this.set("translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: Property): Self = this.set("verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrigin: Self = this.set("verticalOrigin", js.undefined)
    
    @scala.inline
    def setWidth(value: Property): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
