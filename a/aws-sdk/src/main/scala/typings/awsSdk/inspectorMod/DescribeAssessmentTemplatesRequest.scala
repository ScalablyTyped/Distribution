package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTemplatesRequest extends js.Object {
  var assessmentTemplateArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentTemplatesRequest {
  @scala.inline
  def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
  }
}

