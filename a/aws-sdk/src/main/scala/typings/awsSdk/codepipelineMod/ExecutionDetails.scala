package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionDetails extends js.Object {
  
  /**
    * The system-generated unique ID of this action used to identify this job worker in any external systems, such as AWS CodeDeploy.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  
  /**
    * The percentage of work completed on the action, represented on a scale of 0 to 100 percent.
    */
  var percentComplete: js.UndefOr[Percentage] = js.native
  
  /**
    * The summary of the current status of the actions.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.native
}
object ExecutionDetails {
  
  @scala.inline
  def apply(): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionDetails]
  }
  
  @scala.inline
  implicit class ExecutionDetailsOps[Self <: ExecutionDetails] (val x: Self) extends AnyVal {
    
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
    def setExternalExecutionId(value: ExecutionId): Self = this.set("externalExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalExecutionId: Self = this.set("externalExecutionId", js.undefined)
    
    @scala.inline
    def setPercentComplete(value: Percentage): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setSummary(value: ExecutionSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
