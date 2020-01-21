package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The RuleId of the Rule that you want to update. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
  /**
    * An array of RuleUpdate objects that you want to insert into or delete from a Rule. For more information, see the applicable data types:    RuleUpdate: Contains Action and Predicate     Predicate: Contains DataId, Negated, and Type     FieldToMatch: Contains Data and Type   
    */
  var Updates: RuleUpdates = js.native
}

object UpdateRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleId: ResourceId, Updates: RuleUpdates): UpdateRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateRuleRequest]
  }
}

