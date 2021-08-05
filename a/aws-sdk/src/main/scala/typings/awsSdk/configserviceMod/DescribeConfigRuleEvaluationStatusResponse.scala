package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigRuleEvaluationStatusResponse extends StObject {
  
  /**
    * Status information about your AWS managed Config rules.
    */
  var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigRuleEvaluationStatusResponse {
  
  inline def apply(): DescribeConfigRuleEvaluationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
  }
  
  extension [Self <: DescribeConfigRuleEvaluationStatusResponse](x: Self) {
    
    inline def setConfigRulesEvaluationStatus(value: ConfigRuleEvaluationStatusList): Self = StObject.set(x, "ConfigRulesEvaluationStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigRulesEvaluationStatusUndefined: Self = StObject.set(x, "ConfigRulesEvaluationStatus", js.undefined)
    
    inline def setConfigRulesEvaluationStatusVarargs(value: ConfigRuleEvaluationStatus*): Self = StObject.set(x, "ConfigRulesEvaluationStatus", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
