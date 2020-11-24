package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackRuleCompliance extends js.Object {
  
  /**
    * Compliance of the AWS Config rule The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  
  /**
    * Name of the config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
}
object ConformancePackRuleCompliance {
  
  @scala.inline
  def apply(): ConformancePackRuleCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackRuleCompliance]
  }
  
  @scala.inline
  implicit class ConformancePackRuleComplianceOps[Self <: ConformancePackRuleCompliance] (val x: Self) extends AnyVal {
    
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
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleName: Self = this.set("ConfigRuleName", js.undefined)
  }
}
