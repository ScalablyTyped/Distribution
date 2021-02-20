package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRuleInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.elbv2Mod.RuleArn = js.native
}
object DeleteRuleInput {
  
  @scala.inline
  def apply(RuleArn: RuleArn): DeleteRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleInput]
  }
  
  @scala.inline
  implicit class DeleteRuleInputMutableBuilder[Self <: DeleteRuleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
  }
}
