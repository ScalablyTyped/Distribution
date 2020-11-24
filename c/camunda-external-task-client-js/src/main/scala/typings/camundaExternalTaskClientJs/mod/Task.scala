package typings.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  // These are not guaranteed by package documentation, but are returned according to REST API docs
  var activityId: js.UndefOr[String] = js.native
  
  var activityInstanceId: js.UndefOr[String] = js.native
  
  var businessKey: js.UndefOr[String] = js.native
  
  var errorDetails: js.UndefOr[String] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var executionId: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var lockExpirationTime: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var processDefinitionId: js.UndefOr[String] = js.native
  
  var processDefinitionKey: js.UndefOr[String] = js.native
  
  var processInstanceId: js.UndefOr[String] = js.native
  
  var retries: js.UndefOr[Double] = js.native
  
  var tenantId: js.UndefOr[String] = js.native
  
  var topicName: js.UndefOr[String] = js.native
  
  var variables: Variables = js.native
  
  var workerId: js.UndefOr[String] = js.native
}
object Task {
  
  @scala.inline
  def apply(variables: Variables): Task = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
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
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityId(value: String): Self = this.set("activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityId: Self = this.set("activityId", js.undefined)
    
    @scala.inline
    def setActivityInstanceId(value: String): Self = this.set("activityInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityInstanceId: Self = this.set("activityInstanceId", js.undefined)
    
    @scala.inline
    def setBusinessKey(value: String): Self = this.set("businessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessKey: Self = this.set("businessKey", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLockExpirationTime(value: String): Self = this.set("lockExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockExpirationTime: Self = this.set("lockExpirationTime", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProcessDefinitionId(value: String): Self = this.set("processDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessDefinitionId: Self = this.set("processDefinitionId", js.undefined)
    
    @scala.inline
    def setProcessDefinitionKey(value: String): Self = this.set("processDefinitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessDefinitionKey: Self = this.set("processDefinitionKey", js.undefined)
    
    @scala.inline
    def setProcessInstanceId(value: String): Self = this.set("processInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessInstanceId: Self = this.set("processInstanceId", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
}
