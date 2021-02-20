package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssessmentRunsRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment run that you want to describe.
    */
  var assessmentRunArns: BatchDescribeArnList = js.native
}
object DescribeAssessmentRunsRequest {
  
  @scala.inline
  def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsRequest]
  }
  
  @scala.inline
  implicit class DescribeAssessmentRunsRequestMutableBuilder[Self <: DescribeAssessmentRunsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArns(value: BatchDescribeArnList): Self = StObject.set(x, "assessmentRunArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentRunArns", js.Array(value :_*))
  }
}
