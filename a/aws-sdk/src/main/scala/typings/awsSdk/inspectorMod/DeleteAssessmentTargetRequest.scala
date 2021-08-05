package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssessmentTargetRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment target that you want to delete.
    */
  var assessmentTargetArn: Arn
}
object DeleteAssessmentTargetRequest {
  
  inline def apply(assessmentTargetArn: Arn): DeleteAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentTargetRequest]
  }
  
  extension [Self <: DeleteAssessmentTargetRequest](x: Self) {
    
    inline def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
  }
}
