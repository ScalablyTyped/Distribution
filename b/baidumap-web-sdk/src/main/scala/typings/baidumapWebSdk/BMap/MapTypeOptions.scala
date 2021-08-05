package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeOptions extends StObject {
  
  var errorImageUrl: js.UndefOr[String] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var textColor: js.UndefOr[Double] = js.undefined
  
  var tips: js.UndefOr[String] = js.undefined
}
object MapTypeOptions {
  
  inline def apply(): MapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeOptions]
  }
  
  extension [Self <: MapTypeOptions](x: Self) {
    
    inline def setErrorImageUrl(value: String): Self = StObject.set(x, "errorImageUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorImageUrlUndefined: Self = StObject.set(x, "errorImageUrl", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setTextColor(value: Double): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTips(value: String): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
  }
}
