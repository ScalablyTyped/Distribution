package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a message is sent from another app. Cannot be used in a content script.
  * @since Chrome 26.
  */
@JSGlobal("chrome.runtime.onMessageExternal")
@js.native
object onMessageExternal extends TopLevel[ExtensionMessageEvent]

