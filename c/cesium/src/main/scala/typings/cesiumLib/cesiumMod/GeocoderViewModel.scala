package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeocoderViewModel")
@js.native
class GeocoderViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.GeocoderViewModel {
  def this(options: cesiumLib.Anon_Key) = this()
  /* CompleteClass */
  override var complete: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override var flightDuration: scala.Double = js.native
  /* CompleteClass */
  override var isSearchInProgress: scala.Boolean = js.native
  /* CompleteClass */
  override var key: java.lang.String = js.native
  /* CompleteClass */
  override var scene: cesiumLib.cesiumMod.CesiumNs.Scene = js.native
  /* CompleteClass */
  override var search: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var searchText: java.lang.String = js.native
  /* CompleteClass */
  override var url: java.lang.String = js.native
}

