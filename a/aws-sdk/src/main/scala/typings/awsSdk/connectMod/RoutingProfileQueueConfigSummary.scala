package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfileQueueConfigSummary extends js.Object {
  
  /**
    * The channels this queue supports.
    */
  var Channel: typings.awsSdk.connectMod.Channel = js.native
  
  /**
    * The delay, in seconds, that a contact should be in the queue before they are routed to an available agent. For more information, see Queues: priority and delay in the Amazon Connect Administrator Guide.
    */
  var Delay: typings.awsSdk.connectMod.Delay = js.native
  
  /**
    * The order in which contacts are to be handled for the queue. For more information, see Queues: priority and delay.
    */
  var Priority: typings.awsSdk.connectMod.Priority = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var QueueArn: ARN = js.native
  
  /**
    * The identifier of the queue.
    */
  var QueueId: typings.awsSdk.connectMod.QueueId = js.native
  
  /**
    * The name of the queue.
    */
  var QueueName: typings.awsSdk.connectMod.QueueName = js.native
}
object RoutingProfileQueueConfigSummary {
  
  @scala.inline
  def apply(
    Channel: Channel,
    Delay: Delay,
    Priority: Priority,
    QueueArn: ARN,
    QueueId: QueueId,
    QueueName: QueueName
  ): RoutingProfileQueueConfigSummary = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any], QueueName = QueueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueConfigSummary]
  }
  
  @scala.inline
  implicit class RoutingProfileQueueConfigSummaryOps[Self <: RoutingProfileQueueConfigSummary] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Delay): Self = this.set("Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueArn(value: ARN): Self = this.set("QueueArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: QueueId): Self = this.set("QueueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueName(value: QueueName): Self = this.set("QueueName", value.asInstanceOf[js.Any])
  }
}
