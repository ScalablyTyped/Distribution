package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreRulesConfigurationTypeMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreMappingRuleMod._UnmarshalledMappingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRulesConfigurationType extends _RulesConfigurationType {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  @JSName("Rules")
  var Rules__UnmarshalledRulesConfigurationType: js.Array[_UnmarshalledMappingRule]
}

object _UnmarshalledRulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[_UnmarshalledMappingRule]): _UnmarshalledRulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledRulesConfigurationType]
  }
}

