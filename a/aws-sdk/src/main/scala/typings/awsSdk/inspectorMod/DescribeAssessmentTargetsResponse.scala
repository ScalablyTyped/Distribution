package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssessmentTargetsResponse extends StObject {
  
  /**
    * Information about the assessment targets.
    */
  var assessmentTargets: AssessmentTargetList
  
  /**
    * Assessment target details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}
object DescribeAssessmentTargetsResponse {
  
  inline def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargets = assessmentTargets.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
  }
  
  extension [Self <: DescribeAssessmentTargetsResponse](x: Self) {
    
    inline def setAssessmentTargets(value: AssessmentTargetList): Self = StObject.set(x, "assessmentTargets", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTargetsVarargs(value: AssessmentTarget*): Self = StObject.set(x, "assessmentTargets", js.Array(value :_*))
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
