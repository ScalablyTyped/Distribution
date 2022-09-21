package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssessmentRunsResponse extends StObject {
  
  /**
    * Information about the assessment run.
    */
  var assessmentRuns: AssessmentRunList
  
  /**
    * Assessment run details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}
object DescribeAssessmentRunsResponse {
  
  inline def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRuns = assessmentRuns.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsResponse]
  }
  
  extension [Self <: DescribeAssessmentRunsResponse](x: Self) {
    
    inline def setAssessmentRuns(value: AssessmentRunList): Self = StObject.set(x, "assessmentRuns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunsVarargs(value: AssessmentRun*): Self = StObject.set(x, "assessmentRuns", js.Array(value*))
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
