package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentTemplatesRequest extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment targets whose assessment templates you want to list.
    */
  var assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined
  
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentTemplates action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentTemplatesRequest {
  
  @scala.inline
  def apply(): ListAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentTemplatesRequest]
  }
  
  @scala.inline
  implicit class ListAssessmentTemplatesRequestMutableBuilder[Self <: ListAssessmentTemplatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargetArns(value: ListParentArnList): Self = StObject.set(x, "assessmentTargetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTargetArnsUndefined: Self = StObject.set(x, "assessmentTargetArns", js.undefined)
    
    @scala.inline
    def setAssessmentTargetArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTargetArns", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: AssessmentTemplateFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
