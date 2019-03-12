package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationHelpButton extends js.Object {
  var container: stdLib.Element
  var viewModel: NavigationHelpButtonViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object NavigationHelpButton {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    viewModel: NavigationHelpButtonViewModel
  ): NavigationHelpButton = {
    val __obj = js.Dynamic.literal(container = container, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), viewModel = viewModel)
  
    __obj.asInstanceOf[NavigationHelpButton]
  }
}

