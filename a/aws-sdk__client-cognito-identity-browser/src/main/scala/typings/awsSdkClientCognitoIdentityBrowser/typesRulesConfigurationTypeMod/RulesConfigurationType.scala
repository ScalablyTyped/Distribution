package typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.MappingRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesConfigurationType extends js.Object {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.Array[MappingRule] | Iterable[MappingRule]
}

object RulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[MappingRule] | Iterable[MappingRule]): RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigurationType]
  }
}

