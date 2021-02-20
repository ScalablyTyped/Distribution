package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRuleGroupResponse extends StObject {
  
  /**
    * Information about the RuleGroup that you specified in the GetRuleGroup request. 
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.wafMod.RuleGroup] = js.native
}
object GetRuleGroupResponse {
  
  @scala.inline
  def apply(): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
  
  @scala.inline
  implicit class GetRuleGroupResponseMutableBuilder[Self <: GetRuleGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
  }
}
