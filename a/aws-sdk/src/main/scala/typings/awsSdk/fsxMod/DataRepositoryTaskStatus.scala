package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskStatus extends js.Object {
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typings.awsSdk.fsxMod.FailedCount] = js.native
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsSdk.fsxMod.LastUpdatedTime] = js.native
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typings.awsSdk.fsxMod.SucceededCount] = js.native
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.fsxMod.TotalCount] = js.native
}

object DataRepositoryTaskStatus {
  @scala.inline
  def apply(): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
  @scala.inline
  implicit class DataRepositoryTaskStatusOps[Self <: DataRepositoryTaskStatus] (val x: Self) extends AnyVal {
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
    def setFailedCount(value: FailedCount): Self = this.set("FailedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedCount: Self = this.set("FailedCount", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: LastUpdatedTime): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setSucceededCount(value: SucceededCount): Self = this.set("SucceededCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceededCount: Self = this.set("SucceededCount", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

