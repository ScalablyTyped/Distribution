package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssessmentRunsRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment run that you want to describe.
    */
  var assessmentRunArns: BatchDescribeArnList
}
object DescribeAssessmentRunsRequest {
  
  inline def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsRequest]
  }
  
  extension [Self <: DescribeAssessmentRunsRequest](x: Self) {
    
    inline def setAssessmentRunArns(value: BatchDescribeArnList): Self = StObject.set(x, "assessmentRunArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentRunArns", js.Array(value :_*))
  }
}
