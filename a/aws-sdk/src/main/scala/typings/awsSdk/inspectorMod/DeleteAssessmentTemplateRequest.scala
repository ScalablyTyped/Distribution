package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssessmentTemplateRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment template that you want to delete.
    */
  var assessmentTemplateArn: Arn = js.native
}
object DeleteAssessmentTemplateRequest {
  
  @scala.inline
  def apply(assessmentTemplateArn: Arn): DeleteAssessmentTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteAssessmentTemplateRequestMutableBuilder[Self <: DeleteAssessmentTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
