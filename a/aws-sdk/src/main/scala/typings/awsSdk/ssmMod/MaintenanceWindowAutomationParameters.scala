package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowAutomationParameters extends StObject {
  
  /**
    * The version of an Automation document to use during task execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The parameters for the AUTOMATION task. For information about specifying and updating task parameters, see RegisterTaskWithMaintenanceWindow and UpdateMaintenanceWindowTask.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters.  TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. For AUTOMATION task types, Systems Manager ignores any values specified for these parameters. 
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.native
}
object MaintenanceWindowAutomationParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowAutomationParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowAutomationParametersMutableBuilder[Self <: MaintenanceWindowAutomationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setParameters(value: AutomationParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
