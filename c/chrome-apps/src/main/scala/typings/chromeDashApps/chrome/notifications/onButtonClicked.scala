package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The user pressed a button in the notification. */
@JSGlobal("chrome.notifications.onButtonClicked")
@js.native
object onButtonClicked
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function2[/* notificationId */ String, /* buttonIndex */ integer, Unit]]
    ]

