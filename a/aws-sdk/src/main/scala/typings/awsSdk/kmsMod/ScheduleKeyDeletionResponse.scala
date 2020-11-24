package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleKeyDeletionResponse extends js.Object {
  
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[DateType] = js.native
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}
object ScheduleKeyDeletionResponse {
  
  @scala.inline
  def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  
  @scala.inline
  implicit class ScheduleKeyDeletionResponseOps[Self <: ScheduleKeyDeletionResponse] (val x: Self) extends AnyVal {
    
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
    def setDeletionDate(value: DateType): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
}
