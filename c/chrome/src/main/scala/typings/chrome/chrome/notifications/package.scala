package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notifications {
  import typings.chrome.chrome.events.Event

  type NotificationButtonClickedEvent = Event[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]]
  type NotificationClickedEvent = Event[js.Function1[/* notificationId */ String, Unit]]
  type NotificationClosedEvent = Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]]
  type NotificationPermissionLevelChangedEvent = Event[js.Function1[/* level */ String, Unit]]
  type NotificationShowSettingsEvent = Event[js.Function0[Unit]]
}
