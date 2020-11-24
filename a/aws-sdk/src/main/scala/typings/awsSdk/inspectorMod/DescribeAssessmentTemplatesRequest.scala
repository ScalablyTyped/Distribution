package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeAssessmentTemplatesRequestOps[Self <: DescribeAssessmentTemplatesRequest] (val x: Self) extends AnyVal {
    
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
    def setAssessmentTemplateArnsVarargs(value: Arn*): Self = this.set("assessmentTemplateArns", js.Array(value :_*))
    
    @scala.inline
    def setAssessmentTemplateArns(value: BatchDescribeArnList): Self = this.set("assessmentTemplateArns", value.asInstanceOf[js.Any])
  }
}
