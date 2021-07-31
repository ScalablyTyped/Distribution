package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileQueueReference extends StObject {
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var Channel: typings.awsSdk.connectMod.Channel
  
  /**
    * The identifier of the queue.
    */
  var QueueId: typings.awsSdk.connectMod.QueueId
}
object RoutingProfileQueueReference {
  
  @scala.inline
  def apply(Channel: Channel, QueueId: QueueId): RoutingProfileQueueReference = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueReference]
  }
  
  @scala.inline
  implicit class RoutingProfileQueueReferenceMutableBuilder[Self <: RoutingProfileQueueReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
