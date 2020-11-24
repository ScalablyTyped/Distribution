package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMessageActivity extends js.Object {
  
  /**
    * The destination to send the campaign or treatment to. This value can be one of the following: The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or treatment. The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a full URL, including the HTTPS protocol.
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
  def apply(): CustomMessageActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessageActivity]
  }
  
  @scala.inline
  implicit class CustomMessageActivityOps[Self <: CustomMessageActivity] (val x: Self) extends AnyVal {
    
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
    def deleteDeliveryUri: Self = this.set("DeliveryUri", js.undefined)
    
    @scala.inline
    def setEndpointTypesVarargs(value: EndpointTypesElement*): Self = this.set("EndpointTypes", js.Array(value :_*))
    
    @scala.inline
    def setEndpointTypes(value: ListOfEndpointTypesElement): Self = this.set("EndpointTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointTypes: Self = this.set("EndpointTypes", js.undefined)
    
    @scala.inline
    def setMessageConfig(value: JourneyCustomMessage): Self = this.set("MessageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfig: Self = this.set("MessageConfig", js.undefined)
    
    @scala.inline
    def setNextActivity(value: string): Self = this.set("NextActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextActivity: Self = this.set("NextActivity", js.undefined)
    
    @scala.inline
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateVersion(value: string): Self = this.set("TemplateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateVersion: Self = this.set("TemplateVersion", js.undefined)
  }
}
