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

