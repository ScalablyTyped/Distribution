package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotspotOptions extends StObject {
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var offsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var userData: js.UndefOr[js.Any] = js.undefined
}
object HotspotOptions {
  
  inline def apply(): HotspotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotspotOptions]
  }
  
  extension [Self <: HotspotOptions](x: Self) {
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setOffsets(value: js.Array[Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setOffsetsVarargs(value: Double*): Self = StObject.set(x, "offsets", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
