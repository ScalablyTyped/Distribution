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
    * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata is an open-source network IPS that includes a standard rule-based language for network traffic inspection. These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this type of rule group doesn't have a separate action setting. You can provide the rules from a file that you've stored in an Amazon S3 bucket, or by providing the rules in a Suricata rules string. To import from Amazon S3, provide the fully qualified name of the file that contains the rules definitions. To provide a Suricata rule string, provide the complete, Suricata compatible rule.
    */
  var RulesString: js.UndefOr[typings.awsSdk.networkfirewallMod.RulesString] = js.undefined
  
  /**
    * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used together in a stateful rule group. 
    */
  var StatefulRules: js.UndefOr[typings.awsSdk.networkfirewallMod.StatefulRules] = js.undefined
  
  /**
    * Stateless inspection criteria to be used in a stateless rule group. 
    */
  var StatelessRulesAndCustomActions: js.UndefOr[typings.awsSdk.networkfirewallMod.StatelessRulesAndCustomActions] = js.undefined
}
object RulesSource {
  
  @scala.inline
  def apply(): RulesSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesSource]
  }
  
  @scala.inline
  implicit class RulesSourceMutableBuilder[Self <: RulesSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRulesSourceList(value: RulesSourceList): Self = StObject.set(x, "RulesSourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesSourceListUndefined: Self = StObject.set(x, "RulesSourceList", js.undefined)
    
    @scala.inline
    def setRulesString(value: RulesString): Self = StObject.set(x, "RulesString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesStringUndefined: Self = StObject.set(x, "RulesString", js.undefined)
    
    @scala.inline
    def setStatefulRules(value: StatefulRules): Self = StObject.set(x, "StatefulRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulRulesUndefined: Self = StObject.set(x, "StatefulRules", js.undefined)
    
    @scala.inline
    def setStatefulRulesVarargs(value: StatefulRule*): Self = StObject.set(x, "StatefulRules", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRulesAndCustomActions(value: StatelessRulesAndCustomActions): Self = StObject.set(x, "StatelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatelessRulesAndCustomActionsUndefined: Self = StObject.set(x, "StatelessRulesAndCustomActions", js.undefined)
  }
}
