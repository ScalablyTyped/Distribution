package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateActiveVersionRequest extends StObject {
  
  var TemplateActiveVersionRequest: typings.awsSdk.pinpointMod.TemplateActiveVersionRequest
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string
  
  /**
    * The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: string
}
object UpdateTemplateActiveVersionRequest {
  
  @scala.inline
  def apply(
    TemplateActiveVersionRequest: TemplateActiveVersionRequest,
    TemplateName: string,
    TemplateType: string
  ): UpdateTemplateActiveVersionRequest = {
    val __obj = js.Dynamic.literal(TemplateActiveVersionRequest = TemplateActiveVersionRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateActiveVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateTemplateActiveVersionRequestMutableBuilder[Self <: UpdateTemplateActiveVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateActiveVersionRequest(value: TemplateActiveVersionRequest): Self = StObject.set(x, "TemplateActiveVersionRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateType(value: string): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
  }
}
