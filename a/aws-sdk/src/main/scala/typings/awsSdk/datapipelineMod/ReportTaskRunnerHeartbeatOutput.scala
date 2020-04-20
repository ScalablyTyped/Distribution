package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskRunnerHeartbeatOutput extends js.Object {
  /**
    * Indicates whether the calling task runner should terminate.
    */
  var terminate: Boolean = js.native
}

object ReportTaskRunnerHeartbeatOutput {
  @scala.inline
  def apply(terminate: Boolean): ReportTaskRunnerHeartbeatOutput = {
    val __obj = js.Dynamic.literal(terminate = terminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatOutput]
  }
}

