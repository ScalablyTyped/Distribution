package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleGroupRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * The RuleGroupId of the RuleGroup that you want to update. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
  
  /**
    * An array of RuleGroupUpdate objects that you want to insert into or delete from a RuleGroup. You can only insert REGULAR rules into a rule group.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
    */
  var Updates: RuleGroupUpdates
}
object UpdateRuleGroupRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleGroupId: ResourceId, Updates: RuleGroupUpdates): UpdateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateRuleGroupRequestMutableBuilder[Self <: UpdateRuleGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: RuleGroupUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: RuleGroupUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
