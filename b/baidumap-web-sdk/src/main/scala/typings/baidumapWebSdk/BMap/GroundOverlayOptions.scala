package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundOverlayOptions extends StObject {
  
  var displayOnMaxLevel: js.UndefOr[Double] = js.undefined
  
  var displayOnMinLevel: js.UndefOr[Double] = js.undefined
  
  var imageURL: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object GroundOverlayOptions {
  
  inline def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  
  extension [Self <: GroundOverlayOptions](x: Self) {
    
    inline def setDisplayOnMaxLevel(value: Double): Self = StObject.set(x, "displayOnMaxLevel", value.asInstanceOf[js.Any])
    
    inline def setDisplayOnMaxLevelUndefined: Self = StObject.set(x, "displayOnMaxLevel", js.undefined)
    
    inline def setDisplayOnMinLevel(value: Double): Self = StObject.set(x, "displayOnMinLevel", value.asInstanceOf[js.Any])
    
    inline def setDisplayOnMinLevelUndefined: Self = StObject.set(x, "displayOnMinLevel", js.undefined)
    
    inline def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
    
    inline def setImageURLUndefined: Self = StObject.set(x, "imageURL", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
