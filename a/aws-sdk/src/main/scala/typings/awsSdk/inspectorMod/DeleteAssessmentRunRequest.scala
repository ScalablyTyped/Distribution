package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssessmentRunRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment run that you want to delete.
    */
  var assessmentRunArn: Arn = js.native
}
object DeleteAssessmentRunRequest {
  
  @scala.inline
  def apply(assessmentRunArn: Arn): DeleteAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentRunRequest]
  }
  
  @scala.inline
  implicit class DeleteAssessmentRunRequestMutableBuilder[Self <: DeleteAssessmentRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
  }
}
