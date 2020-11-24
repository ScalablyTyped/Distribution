package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class ReportTaskRunnerHeartbeatOutputOps[Self <: ReportTaskRunnerHeartbeatOutput] (val x: Self) extends AnyVal {
    
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
    def setTerminate(value: Boolean): Self = this.set("terminate", value.asInstanceOf[js.Any])
  }
}
