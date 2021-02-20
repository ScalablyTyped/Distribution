package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTemplateResponse extends StObject {
  
  /**
    * The ARN for the template.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The template creation status.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The ID of the template.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The ARN for the template, including the version information of the first version.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}
object CreateTemplateResponse {
  
  @scala.inline
  def apply(): CreateTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateTemplateResponseMutableBuilder[Self <: CreateTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: ResourceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
    
    @scala.inline
    def setVersionArn(value: Arn): Self = StObject.set(x, "VersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionArnUndefined: Self = StObject.set(x, "VersionArn", js.undefined)
  }
}
