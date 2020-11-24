package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionDefinition extends js.Object {
  
  /**
    * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. This setting defines a CloudWatch dimension value to be published. You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet matches the rule, Network Firewall publishes metrics for the packet and forwards it. 
    */
  var PublishMetricAction: js.UndefOr[typings.awsSdk.networkfirewallMod.PublishMetricAction] = js.native
}
object ActionDefinition {
  
  @scala.inline
  def apply(): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDefinition]
  }
  
  @scala.inline
  implicit class ActionDefinitionOps[Self <: ActionDefinition] (val x: Self) extends AnyVal {
    
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
    def setPublishMetricAction(value: PublishMetricAction): Self = this.set("PublishMetricAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishMetricAction: Self = this.set("PublishMetricAction", js.undefined)
  }
}
