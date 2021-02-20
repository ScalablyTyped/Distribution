package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignedAxis extends StObject {
  
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
  implicit class AlignedAxisMutableBuilder[Self <: AlignedAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignedAxis(value: Property): Self = StObject.set(x, "alignedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignedAxisUndefined: Self = StObject.set(x, "alignedAxis", js.undefined)
    
    @scala.inline
    def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Property): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    @scala.inline
    def setHeight(value: Property): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReference(value: Property): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: Property): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    @scala.inline
    def setImage(value: Property): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSubRegion(value: Property): Self = StObject.set(x, "imageSubRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSubRegionUndefined: Self = StObject.set(x, "imageSubRegion", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Property): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: Property): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    @scala.inline
    def setRotation(value: Property): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Property): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistance(value: Property): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: Property): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: Property): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
    
    @scala.inline
    def setWidth(value: Property): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
