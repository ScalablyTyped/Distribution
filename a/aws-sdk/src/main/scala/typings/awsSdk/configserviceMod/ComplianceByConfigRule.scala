package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceByConfigRule extends StObject {
  
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
  implicit class ComplianceByConfigRuleMutableBuilder[Self <: ComplianceByConfigRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
