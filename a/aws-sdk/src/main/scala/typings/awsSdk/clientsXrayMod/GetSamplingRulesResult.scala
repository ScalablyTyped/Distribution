package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingRulesResult extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Rule definitions and metadata.
    */
  var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
}
object GetSamplingRulesResult {
  
  inline def apply(): GetSamplingRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingRulesResult]
  }
  
  extension [Self <: GetSamplingRulesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSamplingRuleRecords(value: SamplingRuleRecordList): Self = StObject.set(x, "SamplingRuleRecords", value.asInstanceOf[js.Any])
    
    inline def setSamplingRuleRecordsUndefined: Self = StObject.set(x, "SamplingRuleRecords", js.undefined)
    
    inline def setSamplingRuleRecordsVarargs(value: SamplingRuleRecord*): Self = StObject.set(x, "SamplingRuleRecords", js.Array(value*))
  }
}
