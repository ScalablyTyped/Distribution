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
  
  inline def apply(): GetComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByConfigRuleResponse]
  }
  
  extension [Self <: GetComplianceDetailsByConfigRuleResponse](x: Self) {
    
    inline def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    inline def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
