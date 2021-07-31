package typings.chromeApps.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////
// WEBVIEW //
/////////////
/**
  * WebView Events, Methods and interfaces.
  */
object WebView {
  
  // Type definitions for Chrome packaged application development
  // Project: http://developer.chrome.com/apps/
  // Definitions by: Nikolai Ommundsen <https://github.com/niikoo>, Adam Lay <https://github.com/AdamLay>, MIZUNE Pine <https://github.com/pine613>, MIZUSHIMA Junki <https://github.com/mzsm>, Ingconst Stepanyan <https://github.com/RReverser>, Adam Pyle <https://github.com/pyle>, Matthew Kimber <https://github.com/matthewkimber>, otiai10 <https://github.com/otiai10>, couven92 <https://github.com/couven92>, RReverser <https://github.com/rreverser>, sreimer15 <https://github.com/sreimer15>
  // Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
  // TypeScript Version: 2.8
  /////////////////
  // Webview Tag //
  /////////////////
  /**
    * Use the webview tag to actively load live content from the web over the network and embed it in your Chrome App.
    * Your app can control the appearance of the *webview* and interact with the web content, initiate navigations in
    * an embedded web page, react to error events that happen within it.
    */
  /* was `typeof HTMLWebViewElement` */
  @JSGlobal("WebView")
  @js.native
  /** Create a new element */
  class ^ ()
    extends StObject
       with typings.chromeApps.HTMLWebViewElement {
    
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
  
  /**
    * WebView Events are different from Chrome Events, they extend the normal DOM Events.
    */
  object Events
}
