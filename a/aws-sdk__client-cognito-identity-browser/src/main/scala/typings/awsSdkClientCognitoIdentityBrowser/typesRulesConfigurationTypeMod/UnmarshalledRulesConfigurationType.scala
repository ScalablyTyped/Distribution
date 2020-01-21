package typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.UnmarshalledMappingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRulesConfigurationType extends RulesConfigurationType {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledRulesConfigurationType: js.Array[UnmarshalledMappingRule]
}

object UnmarshalledRulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledMappingRule]): UnmarshalledRulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnmarshalledRulesConfigurationType]
  }
}

