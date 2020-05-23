package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDeliveryConfiguration extends js.Object {
  /**
    * The destination to send the campaign or treatment to. This value can be one of the following: The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or treatment. The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a full URL, including the HTTPS protocol. 
    */
  var DeliveryUri: string = js.native
  /**
    * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you can associate with an endpoint by using the ChannelType property of an endpoint.
    */
  var EndpointTypes: js.UndefOr[ListOfEndpointTypesElement] = js.native
}

object CustomDeliveryConfiguration {
  @scala.inline
  def apply(DeliveryUri: string, EndpointTypes: ListOfEndpointTypesElement = null): CustomDeliveryConfiguration = {
    val __obj = js.Dynamic.literal(DeliveryUri = DeliveryUri.asInstanceOf[js.Any])
    if (EndpointTypes != null) __obj.updateDynamic("EndpointTypes")(EndpointTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDeliveryConfiguration]
  }
}

