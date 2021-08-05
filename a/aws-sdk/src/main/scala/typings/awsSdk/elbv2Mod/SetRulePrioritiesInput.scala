package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRulePrioritiesInput extends StObject {
  
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList
}
object SetRulePrioritiesInput {
  
  inline def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
  
  extension [Self <: SetRulePrioritiesInput](x: Self) {
    
    inline def setRulePriorities(value: RulePriorityList): Self = StObject.set(x, "RulePriorities", value.asInstanceOf[js.Any])
    
    inline def setRulePrioritiesVarargs(value: RulePriorityPair*): Self = StObject.set(x, "RulePriorities", js.Array(value :_*))
  }
}
