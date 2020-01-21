package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityNotificationAttributes extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish bounce notifications.
    */
  var BounceTopic: NotificationTopic = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish complaint notifications.
    */
  var ComplaintTopic: NotificationTopic = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish delivery notifications.
    */
  var DeliveryTopic: NotificationTopic = js.native
  /**
    * Describes whether Amazon SES will forward bounce and complaint notifications as email. true indicates that Amazon SES will forward bounce and complaint notifications as email, while false indicates that bounce and complaint notifications will be published only to the specified bounce and complaint Amazon SNS topics.
    */
  var ForwardingEnabled: Enabled = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Bounce. A value of true specifies that Amazon SES will include headers in bounce notifications, and a value of false specifies that Amazon SES will not include headers in bounce notifications.
    */
  var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Complaint. A value of true specifies that Amazon SES will include headers in complaint notifications, and a value of false specifies that Amazon SES will not include headers in complaint notifications.
    */
  var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Delivery. A value of true specifies that Amazon SES will include headers in delivery notifications, and a value of false specifies that Amazon SES will not include headers in delivery notifications.
    */
  var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.native
}

object IdentityNotificationAttributes {
  @scala.inline
  def apply(
    BounceTopic: NotificationTopic,
    ComplaintTopic: NotificationTopic,
    DeliveryTopic: NotificationTopic,
    ForwardingEnabled: Enabled,
    HeadersInBounceNotificationsEnabled: js.UndefOr[Boolean] = js.undefined,
    HeadersInComplaintNotificationsEnabled: js.UndefOr[Boolean] = js.undefined,
    HeadersInDeliveryNotificationsEnabled: js.UndefOr[Boolean] = js.undefined
  ): IdentityNotificationAttributes = {
    val __obj = js.Dynamic.literal(BounceTopic = BounceTopic.asInstanceOf[js.Any], ComplaintTopic = ComplaintTopic.asInstanceOf[js.Any], DeliveryTopic = DeliveryTopic.asInstanceOf[js.Any], ForwardingEnabled = ForwardingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HeadersInBounceNotificationsEnabled)) __obj.updateDynamic("HeadersInBounceNotificationsEnabled")(HeadersInBounceNotificationsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HeadersInComplaintNotificationsEnabled)) __obj.updateDynamic("HeadersInComplaintNotificationsEnabled")(HeadersInComplaintNotificationsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(HeadersInDeliveryNotificationsEnabled)) __obj.updateDynamic("HeadersInDeliveryNotificationsEnabled")(HeadersInDeliveryNotificationsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationAttributes]
  }
}

