package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The notification closed, either by the system or by user action. */
@JSGlobal("chrome.notifications.onClosed")
@js.native
object onClosed
  extends TopLevel[Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]]]

