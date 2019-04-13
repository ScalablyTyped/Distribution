package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeocoderViewModel")
@js.native
class GeocoderViewModel protected () extends js.Object {
  def this(options: cesiumLib.Anon_FlightDuration) = this()
  var complete: Event[js.Array[_]] = js.native
  var flightDuration: scala.Double = js.native
  var isSearchInProgress: scala.Boolean = js.native
  var key: java.lang.String = js.native
  var scene: Scene = js.native
  var search: Command = js.native
  var searchText: java.lang.String = js.native
  var url: java.lang.String = js.native
}

