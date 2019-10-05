package typings.chromeDashApps.chrome.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.create")
@js.native
object create extends js.Object {
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification.
    * If not set or empty, an ID will automatically be generated.
    * If it matches an existing notification, this method first
    * clears that notification before proceeding with the create operation.
    * The notificationId parameter is required before Chrome 42.
    * @param options Contents of the notification.
    * @param [callback] Returns the notification id (either supplied or generated) that represents the created notification.
    */
  def apply(notificationId: String, options: NotificationOptions): Unit = js.native
  def apply(
    notificationId: String,
    options: NotificationOptions,
    callback: js.Function1[/* notificationId */ String, Unit]
  ): Unit = js.native
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification.
    * @param options Contents of the notification.
    * @param [callback] Returns the notification id (either supplied or generated) that represents the created notification.
    */
  def apply(options: NotificationOptions): Unit = js.native
  def apply(options: NotificationOptions, callback: js.Function1[/* notificationId */ String, Unit]): Unit = js.native
}

