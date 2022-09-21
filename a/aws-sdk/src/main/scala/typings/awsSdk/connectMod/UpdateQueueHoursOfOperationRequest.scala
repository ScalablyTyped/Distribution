package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueHoursOfOperationRequest extends StObject {
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: typings.awsSdk.connectMod.HoursOfOperationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typings.awsSdk.connectMod.QueueId
}
object UpdateQueueHoursOfOperationRequest {
  
  inline def apply(HoursOfOperationId: HoursOfOperationId, InstanceId: InstanceId, QueueId: QueueId): UpdateQueueHoursOfOperationRequest = {
    val __obj = js.Dynamic.literal(HoursOfOperationId = HoursOfOperationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueHoursOfOperationRequest]
  }
  
  extension [Self <: UpdateQueueHoursOfOperationRequest](x: Self) {
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
