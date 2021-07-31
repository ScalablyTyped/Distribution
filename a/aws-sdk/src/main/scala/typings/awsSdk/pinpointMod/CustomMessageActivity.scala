package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMessageActivity extends StObject {
  
  /**
    * The destination to send the campaign or treatment to. This value can be one of the following: The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or treatment. The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a full URL, including the HTTPS protocol.
    */
  var DeliveryUri: js.UndefOr[string] = js.undefined
  
  /**
    * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can associate with an endpoint by using the ChannelType property of an endpoint.
    */
  var EndpointTypes: js.UndefOr[ListOfEndpointTypesElement] = js.undefined
  
  /**
    * Specifies the message data included in a custom channel message that's sent to participants in a journey.
    */
  var MessageConfig: js.UndefOr[JourneyCustomMessage] = js.undefined
  
  /**
    * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or web hook.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the custom message template to use for the message. If specified, this value must match the name of an existing message template.
    */
  var TemplateName: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the version of the message template to use for the message. If specified, this value must match the identifier for an existing template version. To retrieve a list of versions and version identifiers for a template, use the Template Versions resource. If you don't specify a value for this property, Amazon Pinpoint uses the active version of the template. The active version is typically the version of a template that's been most recently reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a template.
    */
  var TemplateVersion: js.UndefOr[string] = js.undefined
}
object CustomMessageActivity {
  
  @scala.inline
  def apply(): CustomMessageActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomMessageActivity]
  }
  
  @scala.inline
  implicit class CustomMessageActivityMutableBuilder[Self <: CustomMessageActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryUri(value: string): Self = StObject.set(x, "DeliveryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryUriUndefined: Self = StObject.set(x, "DeliveryUri", js.undefined)
    
    @scala.inline
    def setEndpointTypes(value: ListOfEndpointTypesElement): Self = StObject.set(x, "EndpointTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypesUndefined: Self = StObject.set(x, "EndpointTypes", js.undefined)
    
    @scala.inline
    def setEndpointTypesVarargs(value: EndpointTypesElement*): Self = StObject.set(x, "EndpointTypes", js.Array(value :_*))
    
    @scala.inline
    def setMessageConfig(value: JourneyCustomMessage): Self = StObject.set(x, "MessageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageConfigUndefined: Self = StObject.set(x, "MessageConfig", js.undefined)
    
    @scala.inline
    def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateVersion(value: string): Self = StObject.set(x, "TemplateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionUndefined: Self = StObject.set(x, "TemplateVersion", js.undefined)
  }
}
