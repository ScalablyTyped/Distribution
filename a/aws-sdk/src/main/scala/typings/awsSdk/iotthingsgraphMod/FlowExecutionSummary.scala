package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowExecutionSummary extends js.Object {
  
  /**
    * The date and time when the flow execution summary was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.native
  
  /**
    * The ID of the flow.
    */
  var flowTemplateId: js.UndefOr[Urn] = js.native
  
  /**
    * The current status of the flow execution.
    */
  var status: js.UndefOr[FlowExecutionStatus] = js.native
  
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: js.UndefOr[Urn] = js.native
  
  /**
    * The date and time when the flow execution summary was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object FlowExecutionSummary {
  
  @scala.inline
  def apply(): FlowExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionSummary]
  }
  
  @scala.inline
  implicit class FlowExecutionSummaryOps[Self <: FlowExecutionSummary] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setFlowExecutionId(value: FlowExecutionId): Self = this.set("flowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowExecutionId: Self = this.set("flowExecutionId", js.undefined)
    
    @scala.inline
    def setFlowTemplateId(value: Urn): Self = this.set("flowTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowTemplateId: Self = this.set("flowTemplateId", js.undefined)
    
    @scala.inline
    def setStatus(value: FlowExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSystemInstanceId(value: Urn): Self = this.set("systemInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemInstanceId: Self = this.set("systemInstanceId", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
}
