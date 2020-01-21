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
  def apply(ExportTask: ExportTask = null): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    if (ExportTask != null) __obj.updateDynamic("ExportTask")(ExportTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
}

