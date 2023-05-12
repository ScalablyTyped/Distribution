package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityNotificationAttributes extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish bounce notifications.
    */
  var BounceTopic: NotificationTopic
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish complaint notifications.
    */
  var ComplaintTopic: NotificationTopic
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish delivery notifications.
    */
  var DeliveryTopic: NotificationTopic
  
  /**
    * Describes whether Amazon SES will forward bounce and complaint notifications as email. true indicates that Amazon SES will forward bounce and complaint notifications as email, while false indicates that bounce and complaint notifications will be published only to the specified bounce and complaint Amazon SNS topics.
    */
  var ForwardingEnabled: Enabled
  
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Bounce. A value of true specifies that Amazon SES will include headers in bounce notifications, and a value of false specifies that Amazon SES will not include headers in bounce notifications.
    */
  var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Complaint. A value of true specifies that Amazon SES will include headers in complaint notifications, and a value of false specifies that Amazon SES will not include headers in complaint notifications.
    */
  var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Delivery. A value of true specifies that Amazon SES will include headers in delivery notifications, and a value of false specifies that Amazon SES will not include headers in delivery notifications.
    */
  var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
}
object IdentityNotificationAttributes {
  
  inline def apply(
    BounceTopic: NotificationTopic,
    ComplaintTopic: NotificationTopic,
    DeliveryTopic: NotificationTopic,
    ForwardingEnabled: Enabled
  ): IdentityNotificationAttributes = {
    val __obj = js.Dynamic.literal(BounceTopic = BounceTopic.asInstanceOf[js.Any], ComplaintTopic = ComplaintTopic.asInstanceOf[js.Any], DeliveryTopic = DeliveryTopic.asInstanceOf[js.Any], ForwardingEnabled = ForwardingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityNotificationAttributes] (val x: Self) extends AnyVal {
    
    inline def setBounceTopic(value: NotificationTopic): Self = StObject.set(x, "BounceTopic", value.asInstanceOf[js.Any])
    
    inline def setComplaintTopic(value: NotificationTopic): Self = StObject.set(x, "ComplaintTopic", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTopic(value: NotificationTopic): Self = StObject.set(x, "DeliveryTopic", value.asInstanceOf[js.Any])
    
    inline def setForwardingEnabled(value: Enabled): Self = StObject.set(x, "ForwardingEnabled", value.asInstanceOf[js.Any])
    
    inline def setHeadersInBounceNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInBounceNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setHeadersInBounceNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInBounceNotificationsEnabled", js.undefined)
    
    inline def setHeadersInComplaintNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInComplaintNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setHeadersInComplaintNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInComplaintNotificationsEnabled", js.undefined)
    
    inline def setHeadersInDeliveryNotificationsEnabled(value: Enabled): Self = StObject.set(x, "HeadersInDeliveryNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setHeadersInDeliveryNotificationsEnabledUndefined: Self = StObject.set(x, "HeadersInDeliveryNotificationsEnabled", js.undefined)
  }
}
