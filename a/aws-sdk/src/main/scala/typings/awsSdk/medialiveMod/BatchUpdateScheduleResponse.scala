package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateScheduleResponse extends js.Object {
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.native
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.native
}

object BatchUpdateScheduleResponse {
  @scala.inline
  def apply(): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
  @scala.inline
  implicit class BatchUpdateScheduleResponseOps[Self <: BatchUpdateScheduleResponse] (val x: Self) extends AnyVal {
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
    def setCreates(value: BatchScheduleActionCreateResult): Self = this.set("Creates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreates: Self = this.set("Creates", js.undefined)
    @scala.inline
    def setDeletes(value: BatchScheduleActionDeleteResult): Self = this.set("Deletes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletes: Self = this.set("Deletes", js.undefined)
  }
  
}

