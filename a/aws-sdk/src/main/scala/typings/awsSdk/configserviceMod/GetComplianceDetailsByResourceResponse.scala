package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByResourceResponse extends StObject {
  
  /**
    * Indicates whether the specified AWS resource complies each AWS Config rule.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResults] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetComplianceDetailsByResourceResponse {
  
  @scala.inline
  def apply(): GetComplianceDetailsByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByResourceResponse]
  }
  
  @scala.inline
  implicit class GetComplianceDetailsByResourceResponseMutableBuilder[Self <: GetComplianceDetailsByResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    @scala.inline
    def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
