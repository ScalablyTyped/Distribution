package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssessmentRunsResponse extends js.Object {
  
  /**
    * Information about the assessment run.
    */
  var assessmentRuns: AssessmentRunList = js.native
  
  /**
    * Assessment run details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}
object DescribeAssessmentRunsResponse {
  
  @scala.inline
  def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRuns = assessmentRuns.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsResponse]
  }
  
  @scala.inline
  implicit class DescribeAssessmentRunsResponseOps[Self <: DescribeAssessmentRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssessmentRunsVarargs(value: AssessmentRun*): Self = this.set("assessmentRuns", js.Array(value :_*))
    
    @scala.inline
    def setAssessmentRuns(value: AssessmentRunList): Self = this.set("assessmentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
  }
}
