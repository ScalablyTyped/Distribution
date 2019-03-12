package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  val container: stdLib.Element
  val viewModel: AnimationViewModel
  def applyThemeChanges(): scala.Unit
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def resize(): scala.Unit
}

object Animation {
  @scala.inline
  def apply(
    applyThemeChanges: () => scala.Unit,
    container: stdLib.Element,
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    resize: () => scala.Unit,
    viewModel: AnimationViewModel
  ): Animation = {
    val __obj = js.Dynamic.literal(applyThemeChanges = js.Any.fromFunction0(applyThemeChanges), container = container, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), resize = js.Any.fromFunction0(resize), viewModel = viewModel)
  
    __obj.asInstanceOf[Animation]
  }
}

