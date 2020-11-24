package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSamplingRulesResult extends js.Object {
  
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
  implicit class GetSamplingRulesResultOps[Self <: GetSamplingRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSamplingRuleRecordsVarargs(value: SamplingRuleRecord*): Self = this.set("SamplingRuleRecords", js.Array(value :_*))
    
    @scala.inline
    def setSamplingRuleRecords(value: SamplingRuleRecordList): Self = this.set("SamplingRuleRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRuleRecords: Self = this.set("SamplingRuleRecords", js.undefined)
  }
}
