package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqsAction extends js.Object {
  
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
  implicit class SqsActionOps[Self <: SqsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueueUrl(value: QueueUrl): Self = this.set("queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setUseBase64(value: UseBase64): Self = this.set("useBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBase64: Self = this.set("useBase64", js.undefined)
  }
}
