package typings.cesium

import typings.cesium.anon.DestinationFound
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Geocoder.DestinationFoundFunction
import typings.cesium.mod.GeocoderViewModel
import typings.cesium.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsGeocoderGeocoderViewModelMod {
  
  @JSImport("cesium/Source/Widgets/Geocoder/GeocoderViewModel", JSImport.Default)
  @js.native
  open class default protected () extends GeocoderViewModel {
    def this(options: DestinationFound) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Widgets/Geocoder/GeocoderViewModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A function to fly to the destination found by a successful geocode.
      */
    @JSImport("cesium/Source/Widgets/Geocoder/GeocoderViewModel", "default.flyToDestination")
    @js.native
    def flyToDestination: DestinationFoundFunction = js.native
    /**
      * A function to fly to the destination found by a successful geocode.
      */
    inline def flyToDestination(viewModel: GeocoderViewModel, destination: Cartesian3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flyToDestination")(viewModel.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flyToDestination(viewModel: GeocoderViewModel, destination: Rectangle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flyToDestination")(viewModel.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def flyToDestination_=(x: DestinationFoundFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flyToDestination")(x.asInstanceOf[js.Any])
  }
}
