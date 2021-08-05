package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentTargetsResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment targets that are returned by the action.
    */
  var assessmentTargetArns: ListReturnedArnList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentTargetsResponse {
  
  inline def apply(assessmentTargetArns: ListReturnedArnList): ListAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTargetsResponse]
  }
  
  extension [Self <: ListAssessmentTargetsResponse](x: Self) {
    
    inline def setAssessmentTargetArns(value: ListReturnedArnList): Self = StObject.set(x, "assessmentTargetArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTargetArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTargetArns", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
