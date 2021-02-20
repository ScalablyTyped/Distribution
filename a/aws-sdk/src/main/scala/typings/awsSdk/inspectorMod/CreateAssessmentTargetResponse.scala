package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssessmentTargetResponse extends StObject {
  
  /**
    * The ARN that specifies the assessment target that is created.
    */
  var assessmentTargetArn: Arn = js.native
}
object CreateAssessmentTargetResponse {
  
  @scala.inline
  def apply(assessmentTargetArn: Arn): CreateAssessmentTargetResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTargetResponse]
  }
  
  @scala.inline
  implicit class CreateAssessmentTargetResponseMutableBuilder[Self <: CreateAssessmentTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
  }
}
