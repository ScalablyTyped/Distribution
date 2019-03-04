package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geocoder extends js.Object {
  var container: stdLib.Element
  var viewModel: GeocoderViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object Geocoder {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    viewModel: GeocoderViewModel
  ): Geocoder = {
    val __obj = js.Dynamic.literal(container = container, destroy = destroy, isDestroyed = isDestroyed, viewModel = viewModel)
  
    __obj.asInstanceOf[Geocoder]
  }
}

