package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.native
  
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[QueueName] = js.native
  
  /**
    * The type of queue.
    */
  var QueueType: js.UndefOr[typings.awsSdk.connectMod.QueueType] = js.native
}
object QueueSummary {
  
  @scala.inline
  def apply(): QueueSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSummary]
  }
  
  @scala.inline
  implicit class QueueSummaryMutableBuilder[Self <: QueueSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: QueueName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setQueueType(value: QueueType): Self = StObject.set(x, "QueueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTypeUndefined: Self = StObject.set(x, "QueueType", js.undefined)
  }
}
