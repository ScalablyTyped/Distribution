package typings.cesium.mod

import typings.cesium.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillboardOptions extends StObject {
  
  var alignedAxis: js.UndefOr[Cartesian3] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
  
  var eyeOffset: js.UndefOr[Cartesian3] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.undefined
  
  var id: js.UndefOr[js.Any] = js.undefined
  
  var image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback] = js.undefined
  
  var imageSubRegion: js.UndefOr[BoundingRectangle] = js.undefined
  
  var pixelOffset: js.UndefOr[Cartesian2] = js.undefined
  
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  
  var position: js.UndefOr[Cartesian3] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var scaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var sizeInMeters: js.UndefOr[Boolean] = js.undefined
  
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.undefined
  
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object BillboardOptions {
  
  inline def apply(): BillboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillboardOptions]
  }
  
  extension [Self <: BillboardOptions](x: Self) {
    
    inline def setAlignedAxis(value: Cartesian3): Self = StObject.set(x, "alignedAxis", value.asInstanceOf[js.Any])
    
    inline def setAlignedAxisUndefined: Self = StObject.set(x, "alignedAxis", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setEyeOffset(value: Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    inline def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontalOrigin(value: HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: HTMLImageElement | HTMLCanvasElement | String | CreateImageCallback): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageFunction1(
      value: /* id */ String => HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
    ): Self = StObject.set(x, "image", js.Any.fromFunction1(value))
    
    inline def setImageSubRegion(value: BoundingRectangle): Self = StObject.set(x, "imageSubRegion", value.asInstanceOf[js.Any])
    
    inline def setImageSubRegionUndefined: Self = StObject.set(x, "imageSubRegion", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setPixelOffset(value: Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setPosition(value: Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSizeInMeters(value: Boolean): Self = StObject.set(x, "sizeInMeters", value.asInstanceOf[js.Any])
    
    inline def setSizeInMetersUndefined: Self = StObject.set(x, "sizeInMeters", js.undefined)
    
    inline def setTranslucencyByDistance(value: NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    inline def setVerticalOrigin(value: VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    inline def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
