package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LateDataRule extends StObject {
  
  /**
    * The information needed to configure the late data rule.
    */
  var ruleConfiguration: LateDataRuleConfiguration = js.native
  
  /**
    * The name of the late data rule.
    */
  var ruleName: js.UndefOr[LateDataRuleName] = js.native
}
object LateDataRule {
  
  @scala.inline
  def apply(ruleConfiguration: LateDataRuleConfiguration): LateDataRule = {
    val __obj = js.Dynamic.literal(ruleConfiguration = ruleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateDataRule]
  }
  
  @scala.inline
  implicit class LateDataRuleMutableBuilder[Self <: LateDataRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleConfiguration(value: LateDataRuleConfiguration): Self = StObject.set(x, "ruleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: LateDataRuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
  }
}
