package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssessmentRunsRequest extends js.Object {
  
  /**
    * The ARNs that specify the assessment templates whose assessment runs you want to list.
    */
  var assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.native
  
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AssessmentRunFilter] = js.native
  
  /**
    * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.native
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRuns action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssessmentRunsRequest {
  
  @scala.inline
  def apply(): ListAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentRunsRequest]
  }
  
  @scala.inline
  implicit class ListAssessmentRunsRequestOps[Self <: ListAssessmentRunsRequest] (val x: Self) extends AnyVal {
    
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
    def setAssessmentTemplateArns(value: ListParentArnList): Self = this.set("assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessmentTemplateArns: Self = this.set("assessmentTemplateArns", js.undefined)
    
    @scala.inline
    def setFilter(value: AssessmentRunFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
