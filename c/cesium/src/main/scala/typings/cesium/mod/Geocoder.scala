package typings.cesium.mod

import typings.cesium.AnonContainer
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geocoder")
@js.native
class Geocoder protected () extends js.Object {
  def this(options: AnonContainer) = this()
  var container: Element = js.native
  var viewModel: GeocoderViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

