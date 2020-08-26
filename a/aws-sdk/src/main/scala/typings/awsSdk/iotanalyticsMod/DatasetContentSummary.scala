package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentSummary extends js.Object {
  /**
    * The time the dataset content status was updated to SUCCEEDED or FAILED.
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The actual time the creation of the data set contents was started.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time the creation of the data set contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the data set contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  /**
    * The version of the data set contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.native
}

object DatasetContentSummary {
  @scala.inline
  def apply(): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentSummary]
  }
  @scala.inline
  implicit class DatasetContentSummaryOps[Self <: DatasetContentSummary] (val x: Self) extends AnyVal {
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
    def setCompletionTime(value: Timestamp): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionTime: Self = this.set("completionTime", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setScheduleTime(value: Timestamp): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
    @scala.inline
    def setStatus(value: DatasetContentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVersion(value: DatasetContentVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

