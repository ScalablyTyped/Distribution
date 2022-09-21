package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Geocoder.DestinationFoundFunction
import typings.cesium.mod.GeocoderService
import typings.cesium.mod.GeocoderViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationFound extends StObject {
  
  var destinationFound: js.UndefOr[DestinationFoundFunction] = js.undefined
  
  var flightDuration: js.UndefOr[Double] = js.undefined
  
  var geocoderServices: js.UndefOr[js.Array[GeocoderService]] = js.undefined
  
  var scene: typings.cesium.mod.Scene
}
object DestinationFound {
  
  inline def apply(scene: typings.cesium.mod.Scene): DestinationFound = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFound]
  }
  
  extension [Self <: DestinationFound](x: Self) {
    
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
