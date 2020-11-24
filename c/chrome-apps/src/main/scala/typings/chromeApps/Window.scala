package typings.chromeApps

import typings.chromeApps.anon.TypeofAppView
import typings.chromeApps.anon.TypeofWebView
import typings.chromeApps.anon.Typeofchrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////
// GLOBAL //
////////////
@js.native
trait Window extends ChromeWindow {
  
  var AppView: TypeofAppView = js.native
  
  var WebView: TypeofWebView = js.native
  
  var chrome: Typeofchrome = js.native
}
