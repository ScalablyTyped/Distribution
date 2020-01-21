package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionNotification extends js.Object {
  /**
    * The events for the notification. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  /**
    * The ARN of the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.native
  /**
    * The state of the notification.
    */
  var ConnectionNotificationState: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationState] = js.native
  /**
    * The type of notification.
    */
  var ConnectionNotificationType: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationType] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
}

object ConnectionNotification {
  @scala.inline
  def apply(
    ConnectionEvents: ValueStringList = null,
    ConnectionNotificationArn: String = null,
    ConnectionNotificationId: String = null,
    ConnectionNotificationState: ConnectionNotificationState = null,
    ConnectionNotificationType: ConnectionNotificationType = null,
    ServiceId: String = null,
    VpcEndpointId: String = null
  ): ConnectionNotification = {
    val __obj = js.Dynamic.literal()
    if (ConnectionEvents != null) __obj.updateDynamic("ConnectionEvents")(ConnectionEvents.asInstanceOf[js.Any])
    if (ConnectionNotificationArn != null) __obj.updateDynamic("ConnectionNotificationArn")(ConnectionNotificationArn.asInstanceOf[js.Any])
    if (ConnectionNotificationId != null) __obj.updateDynamic("ConnectionNotificationId")(ConnectionNotificationId.asInstanceOf[js.Any])
    if (ConnectionNotificationState != null) __obj.updateDynamic("ConnectionNotificationState")(ConnectionNotificationState.asInstanceOf[js.Any])
    if (ConnectionNotificationType != null) __obj.updateDynamic("ConnectionNotificationType")(ConnectionNotificationType.asInstanceOf[js.Any])
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId.asInstanceOf[js.Any])
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionNotification]
  }
}

