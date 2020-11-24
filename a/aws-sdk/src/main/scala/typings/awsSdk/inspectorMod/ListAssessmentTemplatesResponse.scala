package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssessmentTemplatesResponse extends js.Object {
  
  /**
    * A list of ARNs that specifies the assessment templates returned by the action.
    */
  var assessmentTemplateArns: ListReturnedArnList = js.native
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssessmentTemplatesResponse {
  
  @scala.inline
  def apply(assessmentTemplateArns: ListReturnedArnList): ListAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListAssessmentTemplatesResponseOps[Self <: ListAssessmentTemplatesResponse] (val x: Self) extends AnyVal {
    
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
    def setAssessmentTemplateArns(value: ListReturnedArnList): Self = this.set("assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
