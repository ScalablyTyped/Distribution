package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqsAction extends StObject {
  
  /**
    * You can configure the action payload when you send a message to an Amazon SQS queue.
    */
  var payload: js.UndefOr[Payload] = js.native
  
  /**
    * The URL of the SQS queue where the data is written.
    */
  var queueUrl: QueueUrl = js.native
  
  /**
    * Set this to TRUE if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to FALSE.
    */
  var useBase64: js.UndefOr[UseBase64] = js.native
}
object SqsAction {
  
  @scala.inline
  def apply(queueUrl: QueueUrl): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqsAction]
  }
  
  @scala.inline
  implicit class SqsActionMutableBuilder[Self <: SqsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setQueueUrl(value: QueueUrl): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64(value: UseBase64): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64Undefined: Self = StObject.set(x, "useBase64", js.undefined)
  }
}
