package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetEndpointAttributesInput extends js.Object {
  /**
    * A map of the endpoint attributes. Attributes in this map include the following:    CustomUserData – arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.    Enabled – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true, typically after updating Token.    Token – device token, also referred to as a registration id, for an app and mobile device. This is returned from the notification service when an app and mobile device are registered with the notification service.  
    */
  var Attributes: MapStringToString = js.native
  /**
    * EndpointArn used for SetEndpointAttributes action.
    */
  var EndpointArn: String = js.native
}

object SetEndpointAttributesInput {
  @scala.inline
  def apply(Attributes: MapStringToString, EndpointArn: String): SetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEndpointAttributesInput]
  }
  @scala.inline
  implicit class SetEndpointAttributesInputOps[Self <: SetEndpointAttributesInput] (val x: Self) extends AnyVal {
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
    def setAttributes(value: MapStringToString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
  
}

