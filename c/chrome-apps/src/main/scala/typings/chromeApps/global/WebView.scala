package typings.chromeApps.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    extends typings.chromeApps.HTMLWebViewElement
  
  /**
    * WebView Events are different from Chrome Events, they extend the normal DOM Events.
    */
  object Events
}
