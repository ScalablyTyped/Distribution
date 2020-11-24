package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesSource extends js.Object {
  
  /**
    * Stateful inspection criteria for a domain list rule group. 
    */
  var RulesSourceList: js.UndefOr[typings.awsSdk.networkfirewallMod.RulesSourceList] = js.native
  
  /**
    * Stateful inspection criteria, provided in Suricata compatible intrusion prevention system (IPS) rules. Suricata is an open-source network IPS that includes a standard rule-based language for network traffic inspection. These rules contain the inspection criteria and the action to take for traffic that matches the criteria, so this type of rule group doesn't have a separate action setting. You can provide the rules from a file that you've stored in an Amazon S3 bucket, or by providing the rules in a Suricata rules string. To import from Amazon S3, provide the fully qualified name of the file that contains the rules definitions. To provide a Suricata rule string, provide the complete, Suricata compatible rule.
    */
  var RulesString: js.UndefOr[typings.awsSdk.networkfirewallMod.RulesString] = js.native
  
  /**
    * The 5-tuple stateful inspection criteria. This contains an array of individual 5-tuple stateful rules to be used together in a stateful rule group. 
    */
  var StatefulRules: js.UndefOr[typings.awsSdk.networkfirewallMod.StatefulRules] = js.native
  
  /**
    * Stateless inspection criteria to be used in a stateless rule group. 
    */
  var StatelessRulesAndCustomActions: js.UndefOr[typings.awsSdk.networkfirewallMod.StatelessRulesAndCustomActions] = js.native
}
object RulesSource {
  
  @scala.inline
  def apply(): RulesSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesSource]
  }
  
  @scala.inline
  implicit class RulesSourceOps[Self <: RulesSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRulesSourceList(value: RulesSourceList): Self = this.set("RulesSourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesSourceList: Self = this.set("RulesSourceList", js.undefined)
    
    @scala.inline
    def setRulesString(value: RulesString): Self = this.set("RulesString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesString: Self = this.set("RulesString", js.undefined)
    
    @scala.inline
    def setStatefulRulesVarargs(value: StatefulRule*): Self = this.set("StatefulRules", js.Array(value :_*))
    
    @scala.inline
    def setStatefulRules(value: StatefulRules): Self = this.set("StatefulRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulRules: Self = this.set("StatefulRules", js.undefined)
    
    @scala.inline
    def setStatelessRulesAndCustomActions(value: StatelessRulesAndCustomActions): Self = this.set("StatelessRulesAndCustomActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatelessRulesAndCustomActions: Self = this.set("StatelessRulesAndCustomActions", js.undefined)
  }
}
