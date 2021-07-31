package typings.chrome.global.chrome

import typings.chrome.chrome.browser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browser
////////////////////
/**
  * Use the chrome.browser API to interact with the Chrome browser associated with
  * the current application and Chrome profile.
  */
object browser {
  
  @JSGlobal("chrome.browser")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def openTab(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openTab")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def openTab(options: Options, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openTab")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
