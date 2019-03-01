package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBox extends js.Object {
  var container: stdLib.Element
  var frame: stdLib.HTMLIFrameElement
  var viewModel: InfoBoxViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object InfoBox {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    frame: stdLib.HTMLIFrameElement,
    isDestroyed: js.Function0[scala.Boolean],
    viewModel: InfoBoxViewModel
  ): InfoBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[InfoBox]
  }
}

