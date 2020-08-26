package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceExportTaskResult extends js.Object {
  /**
    * Information about the instance export task.
    */
  var ExportTask: js.UndefOr[typings.awsSdk.ec2Mod.ExportTask] = js.native
}

object CreateInstanceExportTaskResult {
  @scala.inline
  def apply(): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
  @scala.inline
  implicit class CreateInstanceExportTaskResultOps[Self <: CreateInstanceExportTaskResult] (val x: Self) extends AnyVal {
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
    def setExportTask(value: ExportTask): Self = this.set("ExportTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportTask: Self = this.set("ExportTask", js.undefined)
  }
  
}

