package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExclusionsRequest extends StObject {
  
  /**
    * The ARN of the assessment run that generated the exclusions that you want to list.
    */
  var assessmentRunArn: Arn
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 100. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListExclusionsRequest action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExclusionsRequest {
  
  @scala.inline
  def apply(assessmentRunArn: Arn): ListExclusionsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExclusionsRequest]
  }
  
  @scala.inline
  implicit class ListExclusionsRequestMutableBuilder[Self <: ListExclusionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
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
