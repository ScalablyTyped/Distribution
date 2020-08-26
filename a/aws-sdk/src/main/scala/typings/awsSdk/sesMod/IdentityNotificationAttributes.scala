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
    ForwardingEnabled: Enabled
  ): IdentityNotificationAttributes = {
    val __obj = js.Dynamic.literal(BounceTopic = BounceTopic.asInstanceOf[js.Any], ComplaintTopic = ComplaintTopic.asInstanceOf[js.Any], DeliveryTopic = DeliveryTopic.asInstanceOf[js.Any], ForwardingEnabled = ForwardingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationAttributes]
  }
  @scala.inline
  implicit class IdentityNotificationAttributesOps[Self <: IdentityNotificationAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBounceTopic(value: NotificationTopic): Self = this.set("BounceTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplaintTopic(value: NotificationTopic): Self = this.set("ComplaintTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryTopic(value: NotificationTopic): Self = this.set("DeliveryTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setForwardingEnabled(value: Enabled): Self = this.set("ForwardingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersInBounceNotificationsEnabled(value: Enabled): Self = this.set("HeadersInBounceNotificationsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersInBounceNotificationsEnabled: Self = this.set("HeadersInBounceNotificationsEnabled", js.undefined)
    @scala.inline
    def setHeadersInComplaintNotificationsEnabled(value: Enabled): Self = this.set("HeadersInComplaintNotificationsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersInComplaintNotificationsEnabled: Self = this.set("HeadersInComplaintNotificationsEnabled", js.undefined)
    @scala.inline
    def setHeadersInDeliveryNotificationsEnabled(value: Enabled): Self = this.set("HeadersInDeliveryNotificationsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersInDeliveryNotificationsEnabled: Self = this.set("HeadersInDeliveryNotificationsEnabled", js.undefined)
  }
  
}

