package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationStepInfo extends js.Object {
  
  /**
    * 
    The steps current status.
    
    */
  var StepStatus: js.UndefOr[string] = js.native
}
object ClusterOperationStepInfo {
  
  @scala.inline
  def apply(): ClusterOperationStepInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStepInfo]
  }
  
  @scala.inline
  implicit class ClusterOperationStepInfoOps[Self <: ClusterOperationStepInfo] (val x: Self) extends AnyVal {
    
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
    def setStepStatus(value: string): Self = this.set("StepStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepStatus: Self = this.set("StepStatus", js.undefined)
  }
}
