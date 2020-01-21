package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskStatus extends js.Object {
  /**
    * The status code of the export task.
    */
  var code: js.UndefOr[ExportTaskStatusCode] = js.native
  /**
    * The status message related to the status code.
    */
  var message: js.UndefOr[ExportTaskStatusMessage] = js.native
}

object ExportTaskStatus {
  @scala.inline
  def apply(code: ExportTaskStatusCode = null, message: ExportTaskStatusMessage = null): ExportTaskStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskStatus]
  }
}

