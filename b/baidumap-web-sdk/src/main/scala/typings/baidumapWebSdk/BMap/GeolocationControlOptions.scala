package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var enableAutoLocation: js.UndefOr[Boolean] = js.undefined
  
  var locationIcon: js.UndefOr[Icon] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
}
object GeolocationControlOptions {
  
  inline def apply(): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationControlOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setEnableAutoLocation(value: Boolean): Self = StObject.set(x, "enableAutoLocation", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoLocationUndefined: Self = StObject.set(x, "enableAutoLocation", js.undefined)
    
    inline def setLocationIcon(value: Icon): Self = StObject.set(x, "locationIcon", value.asInstanceOf[js.Any])
    
    inline def setLocationIconUndefined: Self = StObject.set(x, "locationIcon", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setShowAddressBar(value: Boolean): Self = StObject.set(x, "showAddressBar", value.asInstanceOf[js.Any])
    
    inline def setShowAddressBarUndefined: Self = StObject.set(x, "showAddressBar", js.undefined)
  }
}
