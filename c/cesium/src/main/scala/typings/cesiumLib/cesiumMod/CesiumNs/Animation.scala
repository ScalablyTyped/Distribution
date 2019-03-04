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
    applyThemeChanges: js.Function0[scala.Unit],
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    resize: js.Function0[scala.Unit],
    viewModel: AnimationViewModel
  ): Animation = {
    val __obj = js.Dynamic.literal(applyThemeChanges = applyThemeChanges, container = container, destroy = destroy, isDestroyed = isDestroyed, resize = resize, viewModel = viewModel)
  
    __obj.asInstanceOf[Animation]
  }
}

