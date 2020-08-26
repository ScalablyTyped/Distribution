package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessControlEffectResponse extends js.Object {
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.native
  /**
    * The rules that match the given parameters, resulting in an effect.
    */
  var MatchedRules: js.UndefOr[AccessControlRuleNameList] = js.native
}

object GetAccessControlEffectResponse {
  @scala.inline
  def apply(): GetAccessControlEffectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessControlEffectResponse]
  }
  @scala.inline
  implicit class GetAccessControlEffectResponseOps[Self <: GetAccessControlEffectResponse] (val x: Self) extends AnyVal {
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
    def setEffect(value: AccessControlRuleEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("Effect", js.undefined)
    @scala.inline
    def setMatchedRulesVarargs(value: AccessControlRuleName*): Self = this.set("MatchedRules", js.Array(value :_*))
    @scala.inline
    def setMatchedRules(value: AccessControlRuleNameList): Self = this.set("MatchedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedRules: Self = this.set("MatchedRules", js.undefined)
  }
  
}

