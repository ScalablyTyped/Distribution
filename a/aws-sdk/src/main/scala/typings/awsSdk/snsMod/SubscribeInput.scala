package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.    RedrivePolicy – When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue. Messages that can't be delivered due to client errors (for example, when the subscribed endpoint is unreachable) or server errors (for example, when the service that powers the subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or reprocessing.  
    */
  var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.native
  /**
    * The endpoint that you want to receive notifications. Endpoints vary by protocol:   For the http protocol, the endpoint is an URL beginning with http://    For the https protocol, the endpoint is a URL beginning with https://    For the email protocol, the endpoint is an email address   For the email-json protocol, the endpoint is an email address   For the sms protocol, the endpoint is a phone number of an SMS-enabled device   For the sqs protocol, the endpoint is the ARN of an Amazon SQS queue   For the application protocol, the endpoint is the EndpointArn of a mobile app and device.   For the lambda protocol, the endpoint is the ARN of an Amazon Lambda function.  
    */
  var Endpoint: js.UndefOr[endpoint] = js.native
  /**
    * The protocol you want to use. Supported protocols include:    http – delivery of JSON-encoded message via HTTP POST    https – delivery of JSON-encoded message via HTTPS POST    email – delivery of message via SMTP    email-json – delivery of JSON-encoded message via SMTP    sms – delivery of message via SMS    sqs – delivery of JSON-encoded message to an Amazon SQS queue    application – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.    lambda – delivery of JSON-encoded message to an Amazon Lambda function.  
    */
  var Protocol: protocol = js.native
  /**
    * Sets whether the response from the Subscribe request includes the subscription ARN, even if the subscription is not yet confirmed.   If you have the subscription ARN returned, the response includes the ARN in all cases, even if the subscription is not yet confirmed.   If you don't have the subscription ARN returned, in addition to the ARN for confirmed subscriptions, the response also includes the pending subscription ARN value for subscriptions that aren't yet confirmed. A subscription becomes confirmed when the subscriber calls the ConfirmSubscription action with a confirmation token.   If you set this parameter to true, . The default value is false.
    */
  var ReturnSubscriptionArn: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the topic you want to subscribe to.
    */
  var TopicArn: topicARN = js.native
}

object SubscribeInput {
  @scala.inline
  def apply(
    Protocol: protocol,
    TopicArn: topicARN,
    Attributes: SubscriptionAttributesMap = null,
    Endpoint: endpoint = null,
    ReturnSubscriptionArn: js.UndefOr[Boolean] = js.undefined
  ): SubscribeInput = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnSubscriptionArn)) __obj.updateDynamic("ReturnSubscriptionArn")(ReturnSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeInput]
  }
}

