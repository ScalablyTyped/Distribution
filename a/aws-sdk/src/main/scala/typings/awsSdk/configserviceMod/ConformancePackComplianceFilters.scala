package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackComplianceFilters extends js.Object {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.native
}
object ConformancePackComplianceFilters {
  
  @scala.inline
  def apply(): ConformancePackComplianceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackComplianceFilters]
  }
  
  @scala.inline
  implicit class ConformancePackComplianceFiltersOps[Self <: ConformancePackComplianceFilters] (val x: Self) extends AnyVal {
    
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
    def setComplianceType(value: ConformancePackComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = this.set("ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = this.set("ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleNames: Self = this.set("ConfigRuleNames", js.undefined)
  }
}
