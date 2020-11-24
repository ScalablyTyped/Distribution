package typings.chrome.global.chrome

import typings.chrome.chrome.browser.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browser
////////////////////
/**
  * Use the chrome.browser API to interact with the Chrome browser associated with
  * the current application and Chrome profile.
  */
@JSGlobal("chrome.browser")
@js.native
object browser extends js.Object {
  
  def openTab(options: Options): Unit = js.native
  def openTab(options: Options, callback: js.Function0[Unit]): Unit = js.native
}
