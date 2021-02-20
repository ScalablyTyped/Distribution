package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeInput extends StObject {
  
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.    RedrivePolicy – When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue. Messages that can't be delivered due to client errors (for example, when the subscribed endpoint is unreachable) or server errors (for example, when the service that powers the subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or reprocessing.  
    */
  var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.native
  
  /**
    * The endpoint that you want to receive notifications. Endpoints vary by protocol:   For the http protocol, the (public) endpoint is a URL beginning with http://    For the https protocol, the (public) endpoint is a URL beginning with https://    For the email protocol, the endpoint is an email address   For the email-json protocol, the endpoint is an email address   For the sms protocol, the endpoint is a phone number of an SMS-enabled device   For the sqs protocol, the endpoint is the ARN of an Amazon SQS queue   For the application protocol, the endpoint is the EndpointArn of a mobile app and device.   For the lambda protocol, the endpoint is the ARN of an Amazon Lambda function.  
    */
  var Endpoint: js.UndefOr[endpoint] = js.native
  
  /**
    * The protocol you want to use. Supported protocols include:    http – delivery of JSON-encoded message via HTTP POST    https – delivery of JSON-encoded message via HTTPS POST    email – delivery of message via SMTP    email-json – delivery of JSON-encoded message via SMTP    sms – delivery of message via SMS    sqs – delivery of JSON-encoded message to an Amazon SQS queue    application – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.    lambda – delivery of JSON-encoded message to an Amazon Lambda function.  
    */
  var Protocol: protocol = js.native
  
  /**
    * Sets whether the response from the Subscribe request includes the subscription ARN, even if the subscription is not yet confirmed. If you set this parameter to true, the response includes the ARN in all cases, even if the subscription is not yet confirmed. In addition to the ARN for confirmed subscriptions, the response also includes the pending subscription ARN value for subscriptions that aren't yet confirmed. A subscription becomes confirmed when the subscriber calls the ConfirmSubscription action with a confirmation token.  The default value is false.
    */
  var ReturnSubscriptionArn: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the topic you want to subscribe to.
    */
  var TopicArn: topicARN = js.native
}
object SubscribeInput {
  
  @scala.inline
  def apply(Protocol: protocol, TopicArn: topicARN): SubscribeInput = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeInput]
  }
  
  @scala.inline
  implicit class SubscribeInputMutableBuilder[Self <: SubscribeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: SubscriptionAttributesMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setEndpoint(value: endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setProtocol(value: protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSubscriptionArn(value: Boolean): Self = StObject.set(x, "ReturnSubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSubscriptionArnUndefined: Self = StObject.set(x, "ReturnSubscriptionArn", js.undefined)
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
