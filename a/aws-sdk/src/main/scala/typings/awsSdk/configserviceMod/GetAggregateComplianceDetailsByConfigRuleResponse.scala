package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateComplianceDetailsByConfigRuleResponse extends StObject {
  
  /**
    * Returns an AggregateEvaluationResults object.
    */
  var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetAggregateComplianceDetailsByConfigRuleResponse {
  
  inline def apply(): GetAggregateComplianceDetailsByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleResponse]
  }
  
  extension [Self <: GetAggregateComplianceDetailsByConfigRuleResponse](x: Self) {
    
    inline def setAggregateEvaluationResults(value: AggregateEvaluationResultList): Self = StObject.set(x, "AggregateEvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setAggregateEvaluationResultsUndefined: Self = StObject.set(x, "AggregateEvaluationResults", js.undefined)
    
    inline def setAggregateEvaluationResultsVarargs(value: AggregateEvaluationResult*): Self = StObject.set(x, "AggregateEvaluationResults", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
