package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSamplingRulesResult extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Rule definitions and metadata.
    */
  var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.native
}
object GetSamplingRulesResult {
  
  @scala.inline
  def apply(): GetSamplingRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingRulesResult]
  }
  
  @scala.inline
  implicit class GetSamplingRulesResultMutableBuilder[Self <: GetSamplingRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSamplingRuleRecords(value: SamplingRuleRecordList): Self = StObject.set(x, "SamplingRuleRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleRecordsUndefined: Self = StObject.set(x, "SamplingRuleRecords", js.undefined)
    
    @scala.inline
    def setSamplingRuleRecordsVarargs(value: SamplingRuleRecord*): Self = StObject.set(x, "SamplingRuleRecords", js.Array(value :_*))
  }
}
