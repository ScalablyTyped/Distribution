package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsRequest extends StObject {
  
  /**
    * The ARNs of the assessment runs that generate the findings that you want to list.
    */
  var assessmentRunArns: js.UndefOr[ListParentArnList] = js.undefined
  
  /**
    * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
    */
  var filter: js.UndefOr[FindingFilter] = js.undefined
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListFindings action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListFindingsRequest {
  
  inline def apply(): ListFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsRequest]
  }
  
  extension [Self <: ListFindingsRequest](x: Self) {
    
    inline def setAssessmentRunArns(value: ListParentArnList): Self = StObject.set(x, "assessmentRunArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunArnsUndefined: Self = StObject.set(x, "assessmentRunArns", js.undefined)
    
    inline def setAssessmentRunArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentRunArns", js.Array(value*))
    
    inline def setFilter(value: FindingFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
