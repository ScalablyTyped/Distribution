package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStepSummary extends StObject {
  
  /**
    * The description of the step.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The number of servers that have been migrated.
    */
  var noOfSrvCompleted: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of servers that have failed to migrate.
    */
  var noOfSrvFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The owner of the step.
    */
  var owner: js.UndefOr[Owner] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The location of the script.
    */
  var scriptLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the step.
    */
  var status: js.UndefOr[StepStatus] = js.undefined
  
  /**
    * The status message of the migration workflow.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: js.UndefOr[StepActionType] = js.undefined
  
  /**
    * The ID of the step.
    */
  var stepId: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of servers that have been migrated.
    */
  var totalNoOfSrv: js.UndefOr[Integer] = js.undefined
}
object WorkflowStepSummary {
  
  inline def apply(): WorkflowStepSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStepSummary]
  }
  
  extension [Self <: WorkflowStepSummary](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setNoOfSrvCompleted(value: Integer): Self = StObject.set(x, "noOfSrvCompleted", value.asInstanceOf[js.Any])
    
    inline def setNoOfSrvCompletedUndefined: Self = StObject.set(x, "noOfSrvCompleted", js.undefined)
    
    inline def setNoOfSrvFailed(value: Integer): Self = StObject.set(x, "noOfSrvFailed", value.asInstanceOf[js.Any])
    
    inline def setNoOfSrvFailedUndefined: Self = StObject.set(x, "noOfSrvFailed", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setScriptLocation(value: String): Self = StObject.set(x, "scriptLocation", value.asInstanceOf[js.Any])
    
    inline def setScriptLocationUndefined: Self = StObject.set(x, "scriptLocation", js.undefined)
    
    inline def setStatus(value: StepStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepActionTypeUndefined: Self = StObject.set(x, "stepActionType", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    inline def setTotalNoOfSrv(value: Integer): Self = StObject.set(x, "totalNoOfSrv", value.asInstanceOf[js.Any])
    
    inline def setTotalNoOfSrvUndefined: Self = StObject.set(x, "totalNoOfSrv", js.undefined)
  }
}
