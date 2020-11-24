package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueuedSavingsPlanRequest extends js.Object {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId = js.native
}
object DeleteQueuedSavingsPlanRequest {
  
  @scala.inline
  def apply(savingsPlanId: SavingsPlanId): DeleteQueuedSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedSavingsPlanRequest]
  }
  
  @scala.inline
  implicit class DeleteQueuedSavingsPlanRequestOps[Self <: DeleteQueuedSavingsPlanRequest] (val x: Self) extends AnyVal {
    
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
    def setSavingsPlanId(value: SavingsPlanId): Self = this.set("savingsPlanId", value.asInstanceOf[js.Any])
  }
}
