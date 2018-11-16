package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notificationsNs {
  type NotificationButtonClickedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* notificationId */ java.lang.String, /* buttonIndex */ scala.Double, scala.Unit]
  ]
  type NotificationClickedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* notificationId */ java.lang.String, scala.Unit]]
  type NotificationClosedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* notificationId */ java.lang.String, /* byUser */ scala.Boolean, scala.Unit]
  ]
  type NotificationPermissionLevelChangedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* level */ java.lang.String, scala.Unit]]
  type NotificationShowSettingsEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}
