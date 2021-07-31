package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentTemplateResponse extends StObject {
  
  /**
    * The ARN that specifies the assessment template that is created.
    */
  var assessmentTemplateArn: Arn
}
object CreateAssessmentTemplateResponse {
  
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateAssessmentTemplateResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateAssessmentTemplateResponseMutableBuilder[Self <: CreateAssessmentTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
