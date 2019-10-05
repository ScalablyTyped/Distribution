package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Deprecated since Chrome 65. Custom notification settings button is no longer supported.
  * @description The user clicked on a link for the app's notification settings.
  * As of Chrome 47, only ChromeOS has UI that dispatches this event.
  * As of Chrome 65, that UI has been removed from ChromeOS, too.
  */
@JSGlobal("chrome.notifications.onShowSettings")
@js.native
object onShowSettings
  extends TopLevel[typings.chromeDashApps.chrome.events.Event[js.Function0[Unit]]]

