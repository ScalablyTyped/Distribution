package typings.cesium.anon

import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDepthTestDistance extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var disableDepthTestDistance: js.UndefOr[Property] = js.undefined
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  
  var heightReference: js.UndefOr[HeightReference] = js.undefined
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var outlineWidth: js.UndefOr[Double] = js.undefined
  
  var pixelSize: js.UndefOr[Double] = js.undefined
  
  var scaleByDistance: js.UndefOr[Property] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var translucencyByDistance: js.UndefOr[Property] = js.undefined
}
object DisableDepthTestDistance {
  
  inline def apply(): DisableDepthTestDistance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableDepthTestDistance]
  }
  
  extension [Self <: DisableDepthTestDistance](x: Self) {
    
    inline def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableDepthTestDistance(value: Property): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    inline def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
    
    inline def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    inline def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    inline def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    inline def setScaleByDistance(value: Property): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTranslucencyByDistance(value: Property): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
  }
}
