package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskExecutionInfo extends js.Object {
  /**
    * The completion time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The creation time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
}

object ExportTaskExecutionInfo {
  @scala.inline
  def apply(): ExportTaskExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskExecutionInfo]
  }
  @scala.inline
  implicit class ExportTaskExecutionInfoOps[Self <: ExportTaskExecutionInfo] (val x: Self) extends AnyVal {
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
  }
  
}

