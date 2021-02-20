package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityNotificationAttributes extends StObject {
  
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
  implicit class IdentityNotificationAttributesMutableBuilder[Self <: IdentityNotificationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounceTopic(value: NotificationTopic): Self = StObject.set(x, "BounceTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplaintTopic(value: NotificationTopic): Self = StObject.set(x, "ComplaintTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTopic(value: NotificationTopic): Self = StObject.set(x, "DeliveryTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingEnabled(value: Enabled): Self = StObject.set(x, "ForwardingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersInBounceNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInBounceNotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersInBounceNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInBounceNotificationsEnabled", js.undefined)
    
    @scala.inline
    def setHeadersInComplaintNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInComplaintNotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersInComplaintNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInComplaintNotificationsEnabled", js.undefined)
    
    @scala.inline
    def setHeadersInDeliveryNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInDeliveryNotificationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersInDeliveryNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInDeliveryNotificationsEnabled", js.undefined)
  }
}
