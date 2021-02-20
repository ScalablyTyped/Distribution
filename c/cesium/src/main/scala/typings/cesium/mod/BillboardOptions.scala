package typings.cesium.mod

import typings.cesium.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillboardOptions extends StObject {
  
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
  implicit class BillboardOptionsMutableBuilder[Self <: BillboardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignedAxis(value: Cartesian3): Self = StObject.set(x, "alignedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignedAxisUndefined: Self = StObject.set(x, "alignedAxis", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFunction1(
      value: /* id */ String => HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
    ): Self = StObject.set(x, "image", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageSubRegion(value: BoundingRectangle): Self = StObject.set(x, "imageSubRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSubRegionUndefined: Self = StObject.set(x, "imageSubRegion", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    @scala.inline
    def setPosition(value: Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSizeInMeters(value: Boolean): Self = StObject.set(x, "sizeInMeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInMetersUndefined: Self = StObject.set(x, "sizeInMeters", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
