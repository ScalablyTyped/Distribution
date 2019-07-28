package typings.cesium.cesiumMod

import typings.cesium.Anon_FlightDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeocoderViewModel")
@js.native
class GeocoderViewModel protected () extends js.Object {
  def this(options: Anon_FlightDuration) = this()
  var complete: Event[js.Array[_]] = js.native
  var flightDuration: Double = js.native
  var isSearchInProgress: Boolean = js.native
  var key: String = js.native
  var scene: Scene = js.native
  var search: Command = js.native
  var searchText: String = js.native
  var url: String = js.native
}

