package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulEngineOptions extends StObject {
  
  /**
    * Indicates how to manage the order of stateful rule evaluation for the policy. DEFAULT_ACTION_ORDER is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more information, see Evaluation order for stateful rules in the Network Firewall Developer Guide. 
    */
  var RuleOrder: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleOrder] = js.undefined
}
object StatefulEngineOptions {
  
  inline def apply(): StatefulEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulEngineOptions]
  }
  
  extension [Self <: StatefulEngineOptions](x: Self) {
    
    inline def setRuleOrder(value: RuleOrder): Self = StObject.set(x, "RuleOrder", value.asInstanceOf[js.Any])
    
    inline def setRuleOrderUndefined: Self = StObject.set(x, "RuleOrder", js.undefined)
  }
}
