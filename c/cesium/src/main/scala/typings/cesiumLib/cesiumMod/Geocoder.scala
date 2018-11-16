package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geocoder")
@js.native
class Geocoder protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Geocoder {
  def this(options: cesiumLib.Anon_UrlContainer) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.GeocoderViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

