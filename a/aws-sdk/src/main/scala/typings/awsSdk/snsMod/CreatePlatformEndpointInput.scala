package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformEndpointInput extends js.Object {
  /**
    * For a list of attributes, see SetEndpointAttributes.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.
    */
  var CustomUserData: js.UndefOr[String] = js.native
  /**
    * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
    */
  var PlatformApplicationArn: String = js.native
  /**
    * Unique identifier created by the notification service for an app on a device. The specific name for Token will vary, depending on which notification service is being used. For example, when using APNS as the notification service, you need the device token. Alternatively, when using FCM or ADM, the device token equivalent is called the registration ID.
    */
  var Token: String = js.native
}

object CreatePlatformEndpointInput {
  @scala.inline
  def apply(
    PlatformApplicationArn: String,
    Token: String,
    Attributes: MapStringToString = null,
    CustomUserData: String = null
  ): CreatePlatformEndpointInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (CustomUserData != null) __obj.updateDynamic("CustomUserData")(CustomUserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformEndpointInput]
  }
}

