package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
  
  /**
    * The number of AWS Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.native
}
object GetComplianceSummaryByConfigRuleResponse {
  
  @scala.inline
  def apply(): GetComplianceSummaryByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryByConfigRuleResponseOps[Self <: GetComplianceSummaryByConfigRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setComplianceSummary(value: ComplianceSummary): Self = this.set("ComplianceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceSummary: Self = this.set("ComplianceSummary", js.undefined)
  }
}
