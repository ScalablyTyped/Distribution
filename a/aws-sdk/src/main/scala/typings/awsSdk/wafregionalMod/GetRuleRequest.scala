package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRuleRequest extends StObject {
  
  /**
    * The RuleId of the Rule that you want to get. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId = js.native
}
object GetRuleRequest {
  
  @scala.inline
  def apply(RuleId: ResourceId): GetRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleRequest]
  }
  
  @scala.inline
  implicit class GetRuleRequestMutableBuilder[Self <: GetRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
