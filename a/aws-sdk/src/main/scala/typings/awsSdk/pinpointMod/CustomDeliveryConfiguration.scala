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
  def apply(DeliveryUri: string): CustomDeliveryConfiguration = {
    val __obj = js.Dynamic.literal(DeliveryUri = DeliveryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDeliveryConfiguration]
  }
  @scala.inline
  implicit class CustomDeliveryConfigurationOps[Self <: CustomDeliveryConfiguration] (val x: Self) extends AnyVal {
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
    def setDeliveryUri(value: string): Self = this.set("DeliveryUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointTypesVarargs(value: EndpointTypesElement*): Self = this.set("EndpointTypes", js.Array(value :_*))
    @scala.inline
    def setEndpointTypes(value: ListOfEndpointTypesElement): Self = this.set("EndpointTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointTypes: Self = this.set("EndpointTypes", js.undefined)
  }
  
}

