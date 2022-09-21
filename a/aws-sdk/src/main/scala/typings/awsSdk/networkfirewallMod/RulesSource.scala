package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesSource extends StObject {
  
  /**
    * Stateful inspection criteria for a domain list rule group. 
    */
  var RulesSourceList: js.UndefOr[typings.awsSdk.networkfirewallMod.RulesSourceList] = js.undefined
  
  /**
    * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata is an open-source network IPS that includes a standard rule-based language for network traffic inspection. These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this type of rule group doesn't have a separate action setting.
    */
  var RulesString: js.UndefOr[typings.awsSdk.networkfirewallMod.RulesString] = js.undefined
  
  /**
    * An array of individual stateful rules inspection criteria to be used together in a stateful rule group. Use this option to specify simple Suricata rules with protocol, source and destination, ports, direction, and rule options. For information about the Suricata Rules format, see Rules Format. 
    */
  var StatefulRules: js.UndefOr[typings.awsSdk.networkfirewallMod.StatefulRules] = js.undefined
  
  /**
    * Stateless inspection criteria to be used in a stateless rule group. 
    */
  var StatelessRulesAndCustomActions: js.UndefOr[typings.awsSdk.networkfirewallMod.StatelessRulesAndCustomActions] = js.undefined
}
object RulesSource {
  
  inline def apply(): RulesSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesSource]
  }
  
  extension [Self <: RulesSource](x: Self) {
    
    inline def setRulesSourceList(value: RulesSourceList): Self = StObject.set(x, "RulesSourceList", value.asInstanceOf[js.Any])
    
    inline def setRulesSourceListUndefined: Self = StObject.set(x, "RulesSourceList", js.undefined)
    
    inline def setRulesString(value: RulesString): Self = StObject.set(x, "RulesString", value.asInstanceOf[js.Any])
    
    inline def setRulesStringUndefined: Self = StObject.set(x, "RulesString", js.undefined)
    
    inline def setStatefulRules(value: StatefulRules): Self = StObject.set(x, "StatefulRules", value.asInstanceOf[js.Any])
    
    inline def setStatefulRulesUndefined: Self = StObject.set(x, "StatefulRules", js.undefined)
    
    inline def setStatefulRulesVarargs(value: StatefulRule*): Self = StObject.set(x, "StatefulRules", js.Array(value*))
    
    inline def setStatelessRulesAndCustomActions(value: StatelessRulesAndCustomActions): Self = StObject.set(x, "StatelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessRulesAndCustomActionsUndefined: Self = StObject.set(x, "StatelessRulesAndCustomActions", js.undefined)
  }
}
