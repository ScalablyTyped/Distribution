package typings.chromeApps.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppView {
  
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
  /* was `typeof HTMLAppViewElement` */
  @JSGlobal("AppView")
  @js.native
  /** Create a new AppView tag */
  class ^ ()
    extends typings.chromeApps.HTMLAppViewElement
}
