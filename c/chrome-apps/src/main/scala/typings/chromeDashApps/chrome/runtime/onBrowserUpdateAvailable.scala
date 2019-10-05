package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated since Chrome 33. Please use **chrome.runtime.onRestartRequired**.
  * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
  */
@JSGlobal("chrome.runtime.onBrowserUpdateAvailable")
@js.native
object onBrowserUpdateAvailable extends TopLevel[RuntimeEvent]

