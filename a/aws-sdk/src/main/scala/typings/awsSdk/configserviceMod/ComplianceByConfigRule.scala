package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceByConfigRule extends js.Object {
  
  /**
    * Indicates whether the AWS Config rule is compliant.
    */
  var Compliance: js.UndefOr[typings.awsSdk.configserviceMod.Compliance] = js.native
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
}
object ComplianceByConfigRule {
  
  @scala.inline
  def apply(): ComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByConfigRule]
  }
  
  @scala.inline
  implicit class ComplianceByConfigRuleOps[Self <: ComplianceByConfigRule] (val x: Self) extends AnyVal {
    
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
    def setCompliance(value: Compliance): Self = this.set("Compliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompliance: Self = this.set("Compliance", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleName: Self = this.set("ConfigRuleName", js.undefined)
  }
}
