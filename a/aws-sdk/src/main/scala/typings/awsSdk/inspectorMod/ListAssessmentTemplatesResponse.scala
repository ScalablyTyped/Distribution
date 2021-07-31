package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentTemplatesResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment templates returned by the action.
    */
  var assessmentTemplateArns: ListReturnedArnList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentTemplatesResponse {
  
  @scala.inline
  def apply(assessmentTemplateArns: ListReturnedArnList): ListAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListAssessmentTemplatesResponseMutableBuilder[Self <: ListAssessmentTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArns(value: ListReturnedArnList): Self = StObject.set(x, "assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTemplateArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTemplateArns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
