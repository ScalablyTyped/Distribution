package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
  /**
    * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
    */
  var Enabled: typings.awsSdk.sesMod.Enabled = js.native
  /**
    * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
    */
  var Identity: typings.awsSdk.sesMod.Identity = js.native
  /**
    * The notification type for which to enable or disable headers in notifications. 
    */
  var NotificationType: typings.awsSdk.sesMod.NotificationType = js.native
}

object SetIdentityHeadersInNotificationsEnabledRequest {
  @scala.inline
  def apply(Enabled: Enabled, Identity: Identity, NotificationType: NotificationType): SetIdentityHeadersInNotificationsEnabledRequest = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
  }
}

