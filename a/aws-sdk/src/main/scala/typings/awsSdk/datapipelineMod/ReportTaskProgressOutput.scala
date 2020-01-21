package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskProgressOutput extends js.Object {
  /**
    * If true, the calling task runner should cancel processing of the task. The task runner does not need to call SetTaskStatus for canceled tasks.
    */
  var canceled: Boolean = js.native
}

object ReportTaskProgressOutput {
  @scala.inline
  def apply(canceled: Boolean): ReportTaskProgressOutput = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReportTaskProgressOutput]
  }
}

