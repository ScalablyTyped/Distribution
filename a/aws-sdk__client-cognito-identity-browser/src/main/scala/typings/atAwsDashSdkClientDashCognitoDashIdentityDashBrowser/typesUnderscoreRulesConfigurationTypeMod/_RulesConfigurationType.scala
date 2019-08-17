package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreRulesConfigurationTypeMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreMappingRuleMod._MappingRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RulesConfigurationType extends js.Object {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.Array[_MappingRule] | Iterable[_MappingRule]
}

object _RulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[_MappingRule] | Iterable[_MappingRule]): _RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_RulesConfigurationType]
  }
}

