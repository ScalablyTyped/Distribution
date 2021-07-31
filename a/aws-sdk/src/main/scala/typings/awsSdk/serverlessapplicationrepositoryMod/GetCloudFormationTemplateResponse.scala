package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCloudFormationTemplateResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time this template expires. Templates
    expire 1 hour after creation.
    */
  var ExpirationTime: js.UndefOr[string] = js.undefined
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.undefined
  
  /**
    * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
    
    */
  var Status: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.Status] = js.undefined
  
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[string] = js.undefined
  
  /**
    * A link to the template that can be used to deploy the application using
    AWS CloudFormation.
    */
  var TemplateUrl: js.UndefOr[string] = js.undefined
}
object GetCloudFormationTemplateResponse {
  
  @scala.inline
  def apply(): GetCloudFormationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCloudFormationTemplateResponse]
  }
  
  @scala.inline
  implicit class GetCloudFormationTemplateResponseMutableBuilder[Self <: GetCloudFormationTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: string): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTemplateId(value: string): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: string): Self = StObject.set(x, "TemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "TemplateUrl", js.undefined)
  }
}
