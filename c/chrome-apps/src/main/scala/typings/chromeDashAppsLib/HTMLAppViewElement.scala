package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////
// AppView Tag //
/////////////////
/**
  * Use the appview tag to embed other Chrome Apps within your Chrome App.
  * The appview runs in a separate process from your app,
  * it doesn't inherit the same permissions and is only allowed
  * to interact with your app through asynchronous APIs.
  * Not all apps can be embedded; apps have to explicitly allow themselves to be embedded.
  * @since Chrome 43.
  * @requires Permissions: 'appview'
  * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
  */
@JSGlobal("HTMLAppViewElement")
@js.native
/** Create a new AppView tag */
class HTMLAppViewElement () extends HTMLElement {
  /**
    * Requests another app to be embedded.
    * @param app The extension id of the app to be embedded.
    * @param [data] Optional developer specified data that the app to be embedded can use when making an embedding decision.
    * @param [callback] Optional callback when the embedding request is completed. Will provide the result.
    */
  def connect(app: java.lang.String): scala.Unit = js.native
  def connect(app: java.lang.String, data: js.Any): scala.Unit = js.native
  def connect(
    app: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* success */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def exitPointerLock(): scala.Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def exitrequestFullscreen(): scala.Unit = js.native
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def requestFullscreen(): js.Promise[scala.Unit] = js.native
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def requestPointerLock(): scala.Unit = js.native
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
  /* CompleteClass */
  override def webkitRequestFullscreen(): scala.Unit = js.native
}

