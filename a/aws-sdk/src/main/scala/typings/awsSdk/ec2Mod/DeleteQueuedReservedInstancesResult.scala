package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedReservedInstancesResult extends js.Object {
  
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.native
  
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.native
}
object DeleteQueuedReservedInstancesResult {
  
  @scala.inline
  def apply(): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
  
  @scala.inline
  implicit class DeleteQueuedReservedInstancesResultOps[Self <: DeleteQueuedReservedInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setFailedQueuedPurchaseDeletionsVarargs(value: FailedQueuedPurchaseDeletion*): Self = this.set("FailedQueuedPurchaseDeletions", js.Array(value :_*))
    
    @scala.inline
    def setFailedQueuedPurchaseDeletions(value: FailedQueuedPurchaseDeletionSet): Self = this.set("FailedQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedQueuedPurchaseDeletions: Self = this.set("FailedQueuedPurchaseDeletions", js.undefined)
    
    @scala.inline
    def setSuccessfulQueuedPurchaseDeletionsVarargs(value: SuccessfulQueuedPurchaseDeletion*): Self = this.set("SuccessfulQueuedPurchaseDeletions", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulQueuedPurchaseDeletions(value: SuccessfulQueuedPurchaseDeletionSet): Self = this.set("SuccessfulQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulQueuedPurchaseDeletions: Self = this.set("SuccessfulQueuedPurchaseDeletions", js.undefined)
  }
}
