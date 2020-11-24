package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfileQueueConfig extends js.Object {
  
  /**
    * The delay, in seconds, a contact should be in the queue before they are routed to an available agent. For more information, see Queues: priority and delay in the Amazon Connect Administrator Guide.
    */
  var Delay: typings.awsSdk.connectMod.Delay = js.native
  
  /**
    * The order in which contacts are to be handled for the queue. For more information, see Queues: priority and delay.
    */
  var Priority: typings.awsSdk.connectMod.Priority = js.native
  
  /**
    * Contains information about a queue resource.
    */
  var QueueReference: RoutingProfileQueueReference = js.native
}
object RoutingProfileQueueConfig {
  
  @scala.inline
  def apply(Delay: Delay, Priority: Priority, QueueReference: RoutingProfileQueueReference): RoutingProfileQueueConfig = {
    val __obj = js.Dynamic.literal(Delay = Delay.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], QueueReference = QueueReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueConfig]
  }
  
  @scala.inline
  implicit class RoutingProfileQueueConfigOps[Self <: RoutingProfileQueueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDelay(value: Delay): Self = this.set("Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueReference(value: RoutingProfileQueueReference): Self = this.set("QueueReference", value.asInstanceOf[js.Any])
  }
}
