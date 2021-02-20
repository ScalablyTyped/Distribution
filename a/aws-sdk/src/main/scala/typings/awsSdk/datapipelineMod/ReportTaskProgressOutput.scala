package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportTaskProgressOutput extends StObject {
  
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
  implicit class ReportTaskProgressOutputMutableBuilder[Self <: ReportTaskProgressOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
  }
}
