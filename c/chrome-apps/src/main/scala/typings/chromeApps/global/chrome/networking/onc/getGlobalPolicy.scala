package typings.chromeApps.global.chrome.networking.onc

import typings.chromeApps.chrome.networking.onc.GlobalPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.networking.onc.getGlobalPolicy")
@js.native
object getGlobalPolicy extends js.Object {
  
  /**
    * Gets the global policy properties.
    * These properties are not expected to change during a session.
    */
  def apply(callback: js.Function1[/* result */ GlobalPolicy, Unit]): Unit = js.native
}
