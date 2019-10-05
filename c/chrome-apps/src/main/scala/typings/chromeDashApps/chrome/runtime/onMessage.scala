package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a message is sent from either an extension process or a content script.
  * @since Chrome 26.
  */
@JSGlobal("chrome.runtime.onMessage")
@js.native
object onMessage extends TopLevel[ExtensionMessageEvent]

