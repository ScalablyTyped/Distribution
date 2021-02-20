package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCloudFormationTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: string = js.native
}
object GetCloudFormationTemplateRequest {
  
  @scala.inline
  def apply(ApplicationId: string, TemplateId: string): GetCloudFormationTemplateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFormationTemplateRequest]
  }
  
  @scala.inline
  implicit class GetCloudFormationTemplateRequestMutableBuilder[Self <: GetCloudFormationTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: string): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
  }
}
