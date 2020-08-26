package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  /**
    * @requires Permissions: 'pointerLock'
    */
  def exitPointerLock(): Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  def exitrequestFullscreen(): Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  def requestFullscreen(): js.Promise[Unit] = js.native
  /**
    * @requires Permissions: 'pointerLock'
    */
  def requestPointerLock(): Unit = js.native
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
  def webkitRequestFullscreen(): Unit = js.native
}

object HTMLElement {
  @scala.inline
  def apply(
    exitPointerLock: () => Unit,
    exitrequestFullscreen: () => Unit,
    requestFullscreen: () => js.Promise[Unit],
    requestPointerLock: () => Unit,
    webkitRequestFullscreen: () => Unit
  ): HTMLElement = {
    val __obj = js.Dynamic.literal(exitPointerLock = js.Any.fromFunction0(exitPointerLock), exitrequestFullscreen = js.Any.fromFunction0(exitrequestFullscreen), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), webkitRequestFullscreen = js.Any.fromFunction0(webkitRequestFullscreen))
    __obj.asInstanceOf[HTMLElement]
  }
  @scala.inline
  implicit class HTMLElementOps[Self <: HTMLElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExitPointerLock(value: () => Unit): Self = this.set("exitPointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def setExitrequestFullscreen(value: () => Unit): Self = this.set("exitrequestFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = this.set("requestFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = this.set("requestPointerLock", js.Any.fromFunction0(value))
    @scala.inline
    def setWebkitRequestFullscreen(value: () => Unit): Self = this.set("webkitRequestFullscreen", js.Any.fromFunction0(value))
  }
  
}

