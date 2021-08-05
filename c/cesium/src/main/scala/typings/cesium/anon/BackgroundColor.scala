package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.LabelStyle
import typings.cesium.mod.Property
import typings.cesium.mod.VerticalOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[Property] = js.undefined
  
  var backgroundPadding: js.UndefOr[Property] = js.undefined
  
  var disableDepthTestDistance: js.UndefOr[Property | Double] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[typings.cesium.mod.DistanceDisplayCondition | Property] = js.undefined
  
  var eyeOffset: js.UndefOr[Property] = js.undefined
  
  var fillColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var heightReference: js.UndefOr[Property] = js.undefined
  
  var horizontalOrigin: js.UndefOr[Property] = js.undefined
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Double] = js.undefined
  
  var pixelOffset: js.UndefOr[Cartesian2 | Property] = js.undefined
  
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.undefined
  
  var scale: js.UndefOr[Property] = js.undefined
  
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Property] = js.undefined
  
  var showBackground: js.UndefOr[Property] = js.undefined
  
  var style: js.UndefOr[LabelStyle | Property] = js.undefined
  
  var text: js.UndefOr[Property | String] = js.undefined
  
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
  
  var verticalOrigin: js.UndefOr[VerticalOrigin | Property] = js.undefined
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: Property): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundPadding(value: Property): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    inline def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    inline def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
    
    inline def setDistanceDisplayCondition(value: typings.cesium.mod.DistanceDisplayCondition | Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setEyeOffset(value: Property): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    inline def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    inline def setFillColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeightReference(value: Property): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setHorizontalOrigin(value: Property): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    inline def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setPixelOffset(value: Cartesian2 | Property): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistance(value: Property): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setScale(value: Property): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleByDistance(value: Property): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowBackground(value: Property): Self = StObject.set(x, "showBackground", value.asInstanceOf[js.Any])
    
    inline def setShowBackgroundUndefined: Self = StObject.set(x, "showBackground", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: LabelStyle | Property): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: Property | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranslucencyByDistance(value: Property): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    inline def setVerticalOrigin(value: VerticalOrigin | Property): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    inline def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
  }
}
