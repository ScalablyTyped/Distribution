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
    exitPointerLock: () => scala.Unit,
    fullscreen: scala.Boolean,
    mozCancelFullScreen: () => scala.Unit,
    mozFullScreen: scala.Boolean,
    mozPointerLockElement: stdLib.HTMLElement,
    msCancelFullScreen: () => scala.Unit,
    msIsFullScreen: scala.Boolean,
    msPointerLockElement: stdLib.HTMLElement,
    pointerLockElement: Element,
    requestPointerLock: () => scala.Unit,
    webkitCancelFullScreen: () => scala.Unit,
    webkitIsFullScreen: scala.Boolean,
    webkitPointerLockElement: stdLib.HTMLElement
  ): Document = {
    val __obj = js.Dynamic.literal(exitPointerLock = js.Any.fromFunction0(exitPointerLock), fullscreen = fullscreen, mozCancelFullScreen = js.Any.fromFunction0(mozCancelFullScreen), mozFullScreen = mozFullScreen, mozPointerLockElement = mozPointerLockElement, msCancelFullScreen = js.Any.fromFunction0(msCancelFullScreen), msIsFullScreen = msIsFullScreen, msPointerLockElement = msPointerLockElement, pointerLockElement = pointerLockElement, requestPointerLock = js.Any.fromFunction0(requestPointerLock), webkitCancelFullScreen = js.Any.fromFunction0(webkitCancelFullScreen), webkitIsFullScreen = webkitIsFullScreen, webkitPointerLockElement = webkitPointerLockElement)
  
    __obj.asInstanceOf[Document]
  }
}

