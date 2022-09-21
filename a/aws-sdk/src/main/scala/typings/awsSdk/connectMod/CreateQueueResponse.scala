package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var QueueArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the queue.
    */
  var QueueId: js.UndefOr[typings.awsSdk.connectMod.QueueId] = js.undefined
}
object CreateQueueResponse {
  
  inline def apply(): CreateQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueResponse]
  }
  
  extension [Self <: CreateQueueResponse](x: Self) {
    
    inline def setQueueArn(value: ARN): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
    
    inline def setQueueArnUndefined: Self = StObject.set(x, "QueueArn", js.undefined)
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
    
    inline def setQueueIdUndefined: Self = StObject.set(x, "QueueId", js.undefined)
  }
}
