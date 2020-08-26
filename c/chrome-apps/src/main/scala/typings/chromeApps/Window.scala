package typings.chromeApps

import typings.chromeApps.anon.TypeofAppView
import typings.chromeApps.anon.TypeofWebView
import typings.chromeApps.anon.Typeofchrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////
// GLOBAL //
////////////
@js.native
trait Window extends ChromeWindow {
  var AppView: TypeofAppView = js.native
  var WebView: TypeofWebView = js.native
  var chrome: Typeofchrome = js.native
}

