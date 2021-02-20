package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateTemplateRequest extends StObject {
  
  /**
    * The ID of the application associated with the AWS CloudFormation template.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * The format for generating the AWS CloudFormation template.
    */
  var templateFormat: js.UndefOr[OutputFormat] = js.native
}
object GenerateTemplateRequest {
  
  @scala.inline
  def apply(): GenerateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTemplateRequest]
  }
  
  @scala.inline
  implicit class GenerateTemplateRequestMutableBuilder[Self <: GenerateTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setTemplateFormat(value: OutputFormat): Self = StObject.set(x, "templateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFormatUndefined: Self = StObject.set(x, "templateFormat", js.undefined)
  }
}
