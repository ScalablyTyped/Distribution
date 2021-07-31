package typings.chromeApps.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class HTMLAppViewElement ()
  extends StObject
     with typings.chromeApps.HTMLAppViewElement {
  
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def exitPointerLock(): Unit = js.native
  
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def exitrequestFullscreen(): Unit = js.native
  
  /**
    * ❗ Unprefixed version are not available as of Chrome 68, in Chrome apps ❗
    */
  /* CompleteClass */
  override def requestFullscreen(): js.Promise[Unit] = js.native
  
  /**
    * @requires Permissions: 'pointerLock'
    */
  /* CompleteClass */
  override def requestPointerLock(): Unit = js.native
  
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
  override def webkitRequestFullscreen(): Unit = js.native
}
