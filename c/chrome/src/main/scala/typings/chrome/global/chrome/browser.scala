package typings.chrome.global.chrome

import typings.chrome.chrome.browser.Options
import org.scalablytyped.runtime.StObject
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
object browser {
  
  @JSGlobal("chrome.browser.openTab")
  @js.native
  def openTab(options: Options): Unit = js.native
  @JSGlobal("chrome.browser.openTab")
  @js.native
  def openTab(options: Options, callback: js.Function0[Unit]): Unit = js.native
}
