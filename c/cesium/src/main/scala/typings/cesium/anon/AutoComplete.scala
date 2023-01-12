package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Geocoder.DestinationFoundFunction
import typings.cesium.mod.GeocoderService
import typings.cesium.mod.GeocoderViewModel
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoComplete extends StObject {
  
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  var container: Element | String
  
  var destinationFound: js.UndefOr[DestinationFoundFunction] = js.undefined
  
  var flightDuration: js.UndefOr[Double] = js.undefined
  
  var geocoderServices: js.UndefOr[js.Array[GeocoderService]] = js.undefined
  
  var scene: typings.cesium.mod.Scene
}
object AutoComplete {
  
  inline def apply(container: Element | String, scene: typings.cesium.mod.Scene): AutoComplete = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoComplete] (val x: Self) extends AnyVal {
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDestinationFound(
      value: (/* viewModel */ GeocoderViewModel, /* destination */ Cartesian3 | typings.cesium.mod.Rectangle) => Unit
    ): Self = StObject.set(x, "destinationFound", js.Any.fromFunction2(value))
    
    inline def setDestinationFoundUndefined: Self = StObject.set(x, "destinationFound", js.undefined)
    
    inline def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
    
    inline def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
    
    inline def setGeocoderServices(value: js.Array[GeocoderService]): Self = StObject.set(x, "geocoderServices", value.asInstanceOf[js.Any])
    
    inline def setGeocoderServicesUndefined: Self = StObject.set(x, "geocoderServices", js.undefined)
    
    inline def setGeocoderServicesVarargs(value: GeocoderService*): Self = StObject.set(x, "geocoderServices", js.Array(value*))
    
    inline def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
