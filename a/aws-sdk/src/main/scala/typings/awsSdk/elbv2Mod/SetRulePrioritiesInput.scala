package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRulePrioritiesInput extends StObject {
  
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList = js.native
}
object SetRulePrioritiesInput {
  
  @scala.inline
  def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
  
  @scala.inline
  implicit class SetRulePrioritiesInputMutableBuilder[Self <: SetRulePrioritiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRulePriorities(value: RulePriorityList): Self = StObject.set(x, "RulePriorities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulePrioritiesVarargs(value: RulePriorityPair*): Self = StObject.set(x, "RulePriorities", js.Array(value :_*))
  }
}
