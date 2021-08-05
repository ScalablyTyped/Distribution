package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
  
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[QueueName] = js.undefined
  
  /**
    * The type of queue.
    */
  var QueueType: js.UndefOr[typings.awsSdk.connectMod.QueueType] = js.undefined
}
object QueueSummary {
  
  inline def apply(): QueueSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSummary]
  }
  
  extension [Self <: QueueSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: QueueName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQueueType(value: QueueType): Self = StObject.set(x, "QueueType", value.asInstanceOf[js.Any])
    
    inline def setQueueTypeUndefined: Self = StObject.set(x, "QueueType", js.undefined)
  }
}
