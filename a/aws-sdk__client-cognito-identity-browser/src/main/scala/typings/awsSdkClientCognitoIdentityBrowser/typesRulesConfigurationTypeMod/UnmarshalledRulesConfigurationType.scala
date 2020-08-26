package typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod

import typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod.UnmarshalledMappingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRulesConfigurationType extends RulesConfigurationType {
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p> <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledRulesConfigurationType: js.Array[UnmarshalledMappingRule] = js.native
}

object UnmarshalledRulesConfigurationType {
  @scala.inline
  def apply(Rules: js.Array[UnmarshalledMappingRule]): UnmarshalledRulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRulesConfigurationType]
  }
  @scala.inline
  implicit class UnmarshalledRulesConfigurationTypeOps[Self <: UnmarshalledRulesConfigurationType] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: UnmarshalledMappingRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[UnmarshalledMappingRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

