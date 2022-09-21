package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the criteria might be that at least one routing control state is On after the transation so that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
    */
  var ASSERTION: js.UndefOr[AssertionRule] = js.undefined
  
  /**
    * A gating rule verifies that a gating routing control or set of gating rounting controls, evaluates as true, based on a rule configuration that you specify, which allows a set of routing control state changes to complete. For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the gating control "switch" to be "On". When you do that, then you can update the routing control states for the target routing controls that you specify in the gating rule.
    */
  var GATING: js.UndefOr[GatingRule] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setASSERTION(value: AssertionRule): Self = StObject.set(x, "ASSERTION", value.asInstanceOf[js.Any])
    
    inline def setASSERTIONUndefined: Self = StObject.set(x, "ASSERTION", js.undefined)
    
    inline def setGATING(value: GatingRule): Self = StObject.set(x, "GATING", value.asInstanceOf[js.Any])
    
    inline def setGATINGUndefined: Self = StObject.set(x, "GATING", js.undefined)
  }
}
