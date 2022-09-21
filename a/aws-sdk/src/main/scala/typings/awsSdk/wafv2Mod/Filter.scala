package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * How to handle logs that satisfy the filter's conditions and requirement. 
    */
  var Behavior: FilterBehavior
  
  /**
    * Match conditions for the filter.
    */
  var Conditions: typings.awsSdk.wafv2Mod.Conditions
  
  /**
    * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
    */
  var Requirement: FilterRequirement
}
object Filter {
  
  inline def apply(Behavior: FilterBehavior, Conditions: Conditions, Requirement: FilterRequirement): Filter = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Conditions = Conditions.asInstanceOf[js.Any], Requirement = Requirement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setBehavior(value: FilterBehavior): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: Conditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "Conditions", js.Array(value*))
    
    inline def setRequirement(value: FilterRequirement): Self = StObject.set(x, "Requirement", value.asInstanceOf[js.Any])
  }
}
