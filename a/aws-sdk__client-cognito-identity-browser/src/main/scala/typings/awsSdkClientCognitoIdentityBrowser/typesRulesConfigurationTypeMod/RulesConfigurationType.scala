package typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.MappingRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesConfigurationType extends js.Object {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.Array[MappingRule] | Iterable[MappingRule] = js.native
}

object RulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[MappingRule] | Iterable[MappingRule]): RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigurationType]
  }
  @scala.inline
  implicit class RulesConfigurationTypeOps[Self <: RulesConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRulesVarargs(value: MappingRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[MappingRule] | Iterable[MappingRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

