package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssessmentRunRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment run that you want to delete.
    */
  var assessmentRunArn: Arn
}
object DeleteAssessmentRunRequest {
  
  inline def apply(assessmentRunArn: Arn): DeleteAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentRunRequest]
  }
  
  extension [Self <: DeleteAssessmentRunRequest](x: Self) {
    
    inline def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
  }
}
