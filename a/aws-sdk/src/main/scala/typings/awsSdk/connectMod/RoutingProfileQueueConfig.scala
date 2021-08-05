package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileQueueConfig extends StObject {
  
  /**
    * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more information, see Queues: priority and delay in the Amazon Connect Administrator Guide.
    */
  var Delay: typings.awsSdk.connectMod.Delay
  
  /**
    * The order in which contacts are to be handled for the queue. For more information, see Queues: priority and delay.
    */
  var Priority: typings.awsSdk.connectMod.Priority
  
  /**
    * Contains information about a queue resource.
    */
  var QueueReference: RoutingProfileQueueReference
}
object RoutingProfileQueueConfig {
  
  inline def apply(Delay: Delay, Priority: Priority, QueueReference: RoutingProfileQueueReference): RoutingProfileQueueConfig = {
    val __obj = js.Dynamic.literal(Delay = Delay.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], QueueReference = QueueReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueConfig]
  }
  
  extension [Self <: RoutingProfileQueueConfig](x: Self) {
    
    inline def setDelay(value: Delay): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setQueueReference(value: RoutingProfileQueueReference): Self = StObject.set(x, "QueueReference", value.asInstanceOf[js.Any])
  }
}
