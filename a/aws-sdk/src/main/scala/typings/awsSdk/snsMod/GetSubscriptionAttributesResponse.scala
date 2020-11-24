package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubscriptionAttributesResponse extends js.Object {
  
  /**
    * A map of the subscription's attributes. Attributes in this map include the following:    ConfirmationWasAuthenticated – true if the subscription confirmation request was authenticated.    DeliveryPolicy – The JSON serialization of the subscription's delivery policy.    EffectiveDeliveryPolicy – The JSON serialization of the effective delivery policy that takes into account the topic delivery policy and account system defaults.    FilterPolicy – The filter policy JSON that is assigned to the subscription. For more information, see Amazon SNS Message Filtering in the Amazon SNS Developer Guide.    Owner – The AWS account ID of the subscription's owner.    PendingConfirmation – true if the subscription hasn't been confirmed. To confirm a pending subscription, call the ConfirmSubscription action with a confirmation token.    RawMessageDelivery – true if raw message delivery is enabled for the subscription. Raw messages are free of JSON formatting and can be sent to HTTP/S and Amazon SQS endpoints.    RedrivePolicy – When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue. Messages that can't be delivered due to client errors (for example, when the subscribed endpoint is unreachable) or server errors (for example, when the service that powers the subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or reprocessing.    SubscriptionArn – The subscription's ARN.    TopicArn – The topic ARN that the subscription is associated with.  
    */
  var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.native
}
object GetSubscriptionAttributesResponse {
  
  @scala.inline
  def apply(): GetSubscriptionAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriptionAttributesResponse]
  }
  
  @scala.inline
  implicit class GetSubscriptionAttributesResponseOps[Self <: GetSubscriptionAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: SubscriptionAttributesMap): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
}
