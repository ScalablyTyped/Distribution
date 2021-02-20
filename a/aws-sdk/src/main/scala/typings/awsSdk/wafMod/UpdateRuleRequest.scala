package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRuleRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  
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
  
  @scala.inline
  implicit class UpdateRuleRequestMutableBuilder[Self <: UpdateRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: RuleUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: RuleUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
