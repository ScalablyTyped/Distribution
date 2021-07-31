package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebookHistoryInfo
  extends StObject
     with AgentJobHistoryInfo {
  
  var materializedNotebookDeleted: Boolean
  
  var materializedNotebookErrorInfo: String
  
  var materializedNotebookId: Double
  
  var materializedNotebookName: String
  
  var materializedNotebookPin: Boolean
}
object AgentNotebookHistoryInfo {
  
  @scala.inline
  def apply(
    instanceId: Double,
    jobId: String,
    jobName: String,
    materializedNotebookDeleted: Boolean,
    materializedNotebookErrorInfo: String,
    materializedNotebookId: Double,
    materializedNotebookName: String,
    materializedNotebookPin: Boolean,
    message: String,
    operatorEmailed: String,
    operatorNetsent: String,
    operatorPaged: String,
    retriesAttempted: String,
    runDate: String,
    runDuration: String,
    runStatus: Double,
    server: String,
    sqlMessageId: String,
    sqlSeverity: String,
    stepId: String,
    stepName: String,
    steps: js.Array[AgentJobStep]
  ): AgentNotebookHistoryInfo = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], materializedNotebookDeleted = materializedNotebookDeleted.asInstanceOf[js.Any], materializedNotebookErrorInfo = materializedNotebookErrorInfo.asInstanceOf[js.Any], materializedNotebookId = materializedNotebookId.asInstanceOf[js.Any], materializedNotebookName = materializedNotebookName.asInstanceOf[js.Any], materializedNotebookPin = materializedNotebookPin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operatorEmailed = operatorEmailed.asInstanceOf[js.Any], operatorNetsent = operatorNetsent.asInstanceOf[js.Any], operatorPaged = operatorPaged.asInstanceOf[js.Any], retriesAttempted = retriesAttempted.asInstanceOf[js.Any], runDate = runDate.asInstanceOf[js.Any], runDuration = runDuration.asInstanceOf[js.Any], runStatus = runStatus.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sqlMessageId = sqlMessageId.asInstanceOf[js.Any], sqlSeverity = sqlSeverity.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookHistoryInfo]
  }
  
  @scala.inline
  implicit class AgentNotebookHistoryInfoMutableBuilder[Self <: AgentNotebookHistoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaterializedNotebookDeleted(value: Boolean): Self = StObject.set(x, "materializedNotebookDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedNotebookErrorInfo(value: String): Self = StObject.set(x, "materializedNotebookErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedNotebookId(value: Double): Self = StObject.set(x, "materializedNotebookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedNotebookName(value: String): Self = StObject.set(x, "materializedNotebookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterializedNotebookPin(value: Boolean): Self = StObject.set(x, "materializedNotebookPin", value.asInstanceOf[js.Any])
  }
}
