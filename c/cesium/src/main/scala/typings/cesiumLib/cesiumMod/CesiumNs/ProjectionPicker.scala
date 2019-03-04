package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionPicker extends js.Object {
  var container: stdLib.Element
  var viewModel: ProjectionPickerViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object ProjectionPicker {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    viewModel: ProjectionPickerViewModel
  ): ProjectionPicker = {
    val __obj = js.Dynamic.literal(container = container, destroy = destroy, isDestroyed = isDestroyed, viewModel = viewModel)
  
    __obj.asInstanceOf[ProjectionPicker]
  }
}

