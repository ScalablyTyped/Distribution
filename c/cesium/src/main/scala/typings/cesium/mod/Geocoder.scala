package typings.cesium.mod

import typings.cesium.anon.AutoComplete
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Geocoder")
@js.native
open class Geocoder protected () extends StObject {
  def this(options: AutoComplete) = this()
  
  /**
    * Gets the parent container.
    */
  var container: Element = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the parent container.
    */
  var searchSuggestionsContainer: Element = js.native
  
  /**
    * Gets the view model.
    */
  var viewModel: GeocoderViewModel = js.native
}
object Geocoder {
  
  /**
    * A function that handles the result of a successful geocode.
    * @param viewModel - The view model.
    * @param destination - The destination result of the geocode.
    */
  type DestinationFoundFunction = js.Function2[/* viewModel */ GeocoderViewModel, /* destination */ Cartesian3 | Rectangle, Unit]
}
