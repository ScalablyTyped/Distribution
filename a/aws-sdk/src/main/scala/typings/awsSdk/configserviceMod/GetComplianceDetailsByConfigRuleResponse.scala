package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByConfigRuleResponse extends StObject {
  
  /**
    * Indicates whether the AWS resource complies with the specified AWS Config rule.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResults] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetComplianceDetailsByConfigRuleResponse {
  
  @scala.inline
  def apply(): GetComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
  }
  
  @scala.inline
  implicit class GetComplianceDetailsByConfigRuleResponseMutableBuilder[Self <: GetComplianceDetailsByConfigRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    @scala.inline
    def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
