package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDefinition extends StObject {
  
  /**
    * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. This setting defines a CloudWatch dimension value to be published. You can pair this custom action with any of the standard stateless rule actions. For example, you could pair this in a rule action with the standard action that forwards the packet for stateful inspection. Then, when a packet matches the rule, Network Firewall publishes metrics for the packet and forwards it. 
    */
  var PublishMetricAction: js.UndefOr[typings.awsSdk.networkfirewallMod.PublishMetricAction] = js.undefined
}
object ActionDefinition {
  
  inline def apply(): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDefinition]
  }
  
  extension [Self <: ActionDefinition](x: Self) {
    
    inline def setPublishMetricAction(value: PublishMetricAction): Self = StObject.set(x, "PublishMetricAction", value.asInstanceOf[js.Any])
    
    inline def setPublishMetricActionUndefined: Self = StObject.set(x, "PublishMetricAction", js.undefined)
  }
}
