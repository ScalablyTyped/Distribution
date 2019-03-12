package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  /**
    * @requires Permissions: 'pointerLock'
    */
  def exitPointerLock(): scala.Unit
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  def exitrequestFullscreen(): scala.Unit
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  def requestFullscreen(): js.Promise[scala.Unit]
  /**
    * @requires Permissions: 'pointerLock'
    */
  def requestPointerLock(): scala.Unit
  /**
    * @requires Permissions: 'app.window.fullscreen', 'app.window.fullscreen.overrideEsc'
    * @description
    * In Chrome Apps, fullscreen is entered without prompting the user or providing
    * exit instructions. HTML5 fullscreen requires the app.window.fullscreen permission
    * in the manifest. In normal webpages, the browser intercepts the ESC key to exit
    * pointer lock ensuring a consistent escape method for users. That is also the
    * behavior in Chrome Apps unless the app.window.fullscreen.overrideEsc permission
    * is used to enable the app to call preventDefault on keydown and keyup events.
    *
    * Then to exit fullscreen, the document exposes a method for that:
    * @example
    * document.webkitExitFullscreen();
    */
  def webkitRequestFullscreen(): scala.Unit
}

object HTMLElement {
  @scala.inline
  def apply(
    exitPointerLock: () => scala.Unit,
    exitrequestFullscreen: () => scala.Unit,
    requestFullscreen: () => js.Promise[scala.Unit],
    requestPointerLock: () => scala.Unit,
    webkitRequestFullscreen: () => scala.Unit
  ): HTMLElement = {
    val __obj = js.Dynamic.literal(exitPointerLock = js.Any.fromFunction0(exitPointerLock), exitrequestFullscreen = js.Any.fromFunction0(exitrequestFullscreen), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), webkitRequestFullscreen = js.Any.fromFunction0(webkitRequestFullscreen))
  
    __obj.asInstanceOf[HTMLElement]
  }
}

