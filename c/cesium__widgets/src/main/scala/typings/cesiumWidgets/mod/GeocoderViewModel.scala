package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.Event
import typings.cesiumEngine.mod.Rectangle
import typings.cesiumEngine.mod.Scene
import typings.cesiumWidgets.anon.DestinationFound
import typings.cesiumWidgets.mod.Geocoder.DestinationFoundFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "GeocoderViewModel")
@js.native
open class GeocoderViewModel protected () extends StObject {
  def this(options: DestinationFound) = this()
  
  /**
    * True if the geocoder should query as the user types to autocomplete
    */
  var autoComplete: Boolean = js.native
  
  /**
    * Gets the event triggered on flight completion.
    */
  var complete: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets and sets the command called when a geocode destination is found
    */
  def destinationFound(viewModel: GeocoderViewModel, destination: Cartesian3): Unit = js.native
  def destinationFound(viewModel: GeocoderViewModel, destination: Rectangle): Unit = js.native
  /**
    * Gets and sets the command called when a geocode destination is found
    */
  @JSName("destinationFound")
  var destinationFound_Original: DestinationFoundFunction = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the the duration of the camera flight in seconds.
    * A value of zero causes the camera to instantly switch to the geocoding location.
    * The duration will be computed based on the distance when undefined.
    */
  var flightDuration: js.UndefOr[Double] = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets a value indicating whether a search is currently in progress.  This property is observable.
    */
  var isSearchInProgress: Boolean = js.native
  
  /**
    * Gets or sets a value indicating if this instance should always show its text input field.
    */
  var keepExpanded: Boolean = js.native
  
  /**
    * Gets the scene to control.
    */
  var scene: Scene = js.native
  
  /**
    * Gets the Command that is executed when the button is clicked.
    */
  var search: Command = js.native
  
  /**
    * Gets or sets the text to search for.  The text can be an address, or longitude, latitude,
    * and optional height, where longitude and latitude are in degrees and height is in meters.
    */
  var searchText: String = js.native
  
  /**
    * Gets the currently selected geocoder search suggestion
    */
  var selectedSuggestion: Any = js.native
  
  /**
    * Gets the list of geocoder search suggestions
    */
  var suggestions: js.Array[js.Object] = js.native
}
/* static members */
object GeocoderViewModel {
  
  @JSImport("@cesium/widgets", "GeocoderViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function to fly to the destination found by a successful geocode.
    */
  @JSImport("@cesium/widgets", "GeocoderViewModel.flyToDestination")
  @js.native
  def flyToDestination: DestinationFoundFunction = js.native
  /**
    * A function to fly to the destination found by a successful geocode.
    */
  inline def flyToDestination(viewModel: GeocoderViewModel, destination: Cartesian3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flyToDestination")(viewModel.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flyToDestination(viewModel: GeocoderViewModel, destination: Rectangle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flyToDestination")(viewModel.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flyToDestination_=(x: DestinationFoundFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flyToDestination")(x.asInstanceOf[js.Any])
}
