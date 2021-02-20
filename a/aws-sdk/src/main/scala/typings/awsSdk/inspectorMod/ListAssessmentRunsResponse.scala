package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssessmentRunsResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment runs that are returned by the action.
    */
  var assessmentRunArns: ListReturnedArnList = js.native
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAssessmentRunsResponse {
  
  @scala.inline
  def apply(assessmentRunArns: ListReturnedArnList): ListAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunsResponse]
  }
  
  @scala.inline
  implicit class ListAssessmentRunsResponseMutableBuilder[Self <: ListAssessmentRunsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentRunArns(value: ListReturnedArnList): Self = StObject.set(x, "assessmentRunArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentRunArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentRunArns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
