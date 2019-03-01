package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var fullscreen: scala.Boolean
  var mozFullScreen: scala.Boolean
  var mozPointerLockElement: stdLib.HTMLElement
  var msIsFullScreen: scala.Boolean
  var msPointerLockElement: stdLib.HTMLElement
  val pointerLockElement: Element
  val webkitIsFullScreen: scala.Boolean
  var webkitPointerLockElement: stdLib.HTMLElement
  def exitPointerLock(): scala.Unit
  def mozCancelFullScreen(): scala.Unit
  def msCancelFullScreen(): scala.Unit
  def requestPointerLock(): scala.Unit
  def webkitCancelFullScreen(): scala.Unit
}

object Document {
  @scala.inline
  def apply(
    exitPointerLock: js.Function0[scala.Unit],
    fullscreen: scala.Boolean,
    mozCancelFullScreen: js.Function0[scala.Unit],
    mozFullScreen: scala.Boolean,
    mozPointerLockElement: stdLib.HTMLElement,
    msCancelFullScreen: js.Function0[scala.Unit],
    msIsFullScreen: scala.Boolean,
    msPointerLockElement: stdLib.HTMLElement,
    pointerLockElement: Element,
    requestPointerLock: js.Function0[scala.Unit],
    webkitCancelFullScreen: js.Function0[scala.Unit],
    webkitIsFullScreen: scala.Boolean,
    webkitPointerLockElement: stdLib.HTMLElement
  ): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exitPointerLock")(exitPointerLock)
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.updateDynamic("mozCancelFullScreen")(mozCancelFullScreen)
    __obj.updateDynamic("mozFullScreen")(mozFullScreen)
    __obj.updateDynamic("mozPointerLockElement")(mozPointerLockElement)
    __obj.updateDynamic("msCancelFullScreen")(msCancelFullScreen)
    __obj.updateDynamic("msIsFullScreen")(msIsFullScreen)
    __obj.updateDynamic("msPointerLockElement")(msPointerLockElement)
    __obj.updateDynamic("pointerLockElement")(pointerLockElement)
    __obj.updateDynamic("requestPointerLock")(requestPointerLock)
    __obj.updateDynamic("webkitCancelFullScreen")(webkitCancelFullScreen)
    __obj.updateDynamic("webkitIsFullScreen")(webkitIsFullScreen)
    __obj.updateDynamic("webkitPointerLockElement")(webkitPointerLockElement)
    __obj.asInstanceOf[Document]
  }
}

