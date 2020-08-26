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
  @scala.inline
  implicit class ReportTaskProgressOutputOps[Self <: ReportTaskProgressOutput] (val x: Self) extends AnyVal {
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
    def setCanceled(value: Boolean): Self = this.set("canceled", value.asInstanceOf[js.Any])
  }
  
}

