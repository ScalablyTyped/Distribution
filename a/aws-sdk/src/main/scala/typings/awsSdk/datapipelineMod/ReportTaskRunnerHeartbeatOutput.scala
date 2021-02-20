package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTaskRunnerHeartbeatOutput extends StObject {
  
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
  implicit class ReportTaskRunnerHeartbeatOutputMutableBuilder[Self <: ReportTaskRunnerHeartbeatOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminate(value: Boolean): Self = StObject.set(x, "terminate", value.asInstanceOf[js.Any])
  }
}
