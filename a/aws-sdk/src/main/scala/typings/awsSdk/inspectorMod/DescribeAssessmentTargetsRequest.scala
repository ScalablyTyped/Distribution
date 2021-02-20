package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssessmentTargetsRequest extends StObject {
  
  /**
    * The ARNs that specifies the assessment targets that you want to describe.
    */
  var assessmentTargetArns: BatchDescribeArnList = js.native
}
object DescribeAssessmentTargetsRequest {
  
  @scala.inline
  def apply(assessmentTargetArns: BatchDescribeArnList): DescribeAssessmentTargetsRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTargetsRequest]
  }
  
  @scala.inline
  implicit class DescribeAssessmentTargetsRequestMutableBuilder[Self <: DescribeAssessmentTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargetArns(value: BatchDescribeArnList): Self = StObject.set(x, "assessmentTargetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTargetArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTargetArns", js.Array(value :_*))
  }
}
