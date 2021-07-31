package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var enableAutoResize: js.UndefOr[Boolean] = js.undefined
  
  var enableHighResolution: js.UndefOr[Boolean] = js.undefined
  
  var enableMapClick: js.UndefOr[Boolean] = js.undefined
  
  var mapType: js.UndefOr[MapType] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAutoResize(value: Boolean): Self = StObject.set(x, "enableAutoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoResizeUndefined: Self = StObject.set(x, "enableAutoResize", js.undefined)
    
    @scala.inline
    def setEnableHighResolution(value: Boolean): Self = StObject.set(x, "enableHighResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighResolutionUndefined: Self = StObject.set(x, "enableHighResolution", js.undefined)
    
    @scala.inline
    def setEnableMapClick(value: Boolean): Self = StObject.set(x, "enableMapClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMapClickUndefined: Self = StObject.set(x, "enableMapClick", js.undefined)
    
    @scala.inline
    def setMapType(value: MapType): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
  }
}
