package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOptions extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var backgroundPadding: js.UndefOr[Cartesian2] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.undefined
  
  var eyeOffset: js.UndefOr[Cartesian3] = js.undefined
  
  var fillColor: js.UndefOr[Color] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.undefined
  
  var outlineColor: js.UndefOr[Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Double] = js.undefined
  
  var pixelOffset: js.UndefOr[Cartesian2] = js.undefined
  
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.undefined
  
  var position: js.UndefOr[Cartesian3] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showBackground: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[LabelStyle] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.undefined
  
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.undefined
}
object LabelOptions {
  
  inline def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  extension [Self <: LabelOptions](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundPadding(value: Cartesian2): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    inline def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setEyeOffset(value: Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    inline def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    inline def setFillColor(value: Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setHorizontalOrigin(value: HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    inline def setOutlineColor(value: Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setPixelOffset(value: Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setPosition(value: Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowBackground(value: Boolean): Self = StObject.set(x, "showBackground", value.asInstanceOf[js.Any])
    
    inline def setShowBackgroundUndefined: Self = StObject.set(x, "showBackground", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: LabelStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranslucencyByDistance(value: NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    inline def setVerticalOrigin(value: VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    inline def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
  }
}
