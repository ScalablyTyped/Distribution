package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMessageActivity extends js.Object {
  /**
    * The destination to send the custom message to. This value can be one of the following: The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the custom message. The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a full URL, including the HTTPS protocol.
    */
  var DeliveryUri: js.UndefOr[string] = js.native
  /**
    * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can associate with an endpoint by using the ChannelType property of an endpoint.
    */
  var EndpointTypes: js.UndefOr[ListOfEndpointTypesElement] = js.native
  /**
    * Specifies the message data included in a custom channel message that's sent to participants in a journey.
    */
  var MessageConfig: js.UndefOr[JourneyCustomMessage] = js.native
  /**
    * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or web hook.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The name of the custom message template to use for the message. If specified, this value must match the name of an existing message template.
    */
  var TemplateName: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the version of the message template to use for the message. If specified, this value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource. If you don't specify a value for this property, Amazon Pinpoint uses the active version of the template. The active version is typically the version of a template that's been most recently reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a template.
    */
  var TemplateVersion: js.UndefOr[string] = js.native
}

object CustomMessageActivity {
  @scala.inline
  def apply(
    DeliveryUri: string = null,
    EndpointTypes: ListOfEndpointTypesElement = null,
    MessageConfig: JourneyCustomMessage = null,
    NextActivity: string = null,
    TemplateName: string = null,
    TemplateVersion: string = null
  ): CustomMessageActivity = {
    val __obj = js.Dynamic.literal()
    if (DeliveryUri != null) __obj.updateDynamic("DeliveryUri")(DeliveryUri.asInstanceOf[js.Any])
    if (EndpointTypes != null) __obj.updateDynamic("EndpointTypes")(EndpointTypes.asInstanceOf[js.Any])
    if (MessageConfig != null) __obj.updateDynamic("MessageConfig")(MessageConfig.asInstanceOf[js.Any])
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (TemplateVersion != null) __obj.updateDynamic("TemplateVersion")(TemplateVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMessageActivity]
  }
}

