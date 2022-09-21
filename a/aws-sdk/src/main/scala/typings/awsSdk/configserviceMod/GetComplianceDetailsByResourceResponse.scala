package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByResourceResponse extends StObject {
  
  /**
    * Indicates whether the specified Amazon Web Services resource complies each Config rule.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResults] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetComplianceDetailsByResourceResponse {
  
  inline def apply(): GetComplianceDetailsByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailsByResourceResponse]
  }
  
  extension [Self <: GetComplianceDetailsByResourceResponse](x: Self) {
    
    inline def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    inline def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
