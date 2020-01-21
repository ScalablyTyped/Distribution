package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTemplatesResponse extends js.Object {
  /**
    * Information about the assessment templates.
    */
  var assessmentTemplates: AssessmentTemplateList = js.native
  /**
    * Assessment template details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentTemplatesResponse {
  @scala.inline
  def apply(assessmentTemplates: AssessmentTemplateList, failedItems: FailedItems): DescribeAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplates = assessmentTemplates.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssessmentTemplatesResponse]
  }
}

