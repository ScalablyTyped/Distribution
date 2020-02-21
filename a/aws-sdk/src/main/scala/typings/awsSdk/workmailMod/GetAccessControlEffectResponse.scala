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
  def apply(Effect: AccessControlRuleEffect = null, MatchedRules: AccessControlRuleNameList = null): GetAccessControlEffectResponse = {
    val __obj = js.Dynamic.literal()
    if (Effect != null) __obj.updateDynamic("Effect")(Effect.asInstanceOf[js.Any])
    if (MatchedRules != null) __obj.updateDynamic("MatchedRules")(MatchedRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessControlEffectResponse]
  }
}

