package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueprintRun extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The date and time that the blueprint run completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates any errors that are seen while running the blueprint.
    */
  var ErrorMessage: js.UndefOr[MessageString] = js.undefined
  
  /**
    * The blueprint parameters as a string. You will have to provide a value for each key that is required from the parameter spec that is defined in the Blueprint$ParameterSpec.
    */
  var Parameters: js.UndefOr[BlueprintParameters] = js.undefined
  
  /**
    * The role ARN. This role will be assumed by the Glue service and will be used to create the workflow and other entities of a workflow.
    */
  var RoleArn: js.UndefOr[OrchestrationIAMRoleArn] = js.undefined
  
  /**
    * If there are any errors while creating the entities of a workflow, we try to roll back the created entities until that point and delete them. This attribute indicates the errors seen while trying to delete the entities that are created.
    */
  var RollbackErrorMessage: js.UndefOr[MessageString] = js.undefined
  
  /**
    * The run ID for this blueprint run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
  
  /**
    * The date and time that the blueprint run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the blueprint run. Possible values are:   Running — The blueprint run is in progress.   Succeeded — The blueprint run completed successfully.   Failed — The blueprint run failed and rollback is complete.   Rolling Back — The blueprint run failed and rollback is in progress.  
    */
  var State: js.UndefOr[BlueprintRunState] = js.undefined
  
  /**
    * The name of a workflow that is created as a result of a successful blueprint run. If a blueprint run has an error, there will not be a workflow created.
    */
  var WorkflowName: js.UndefOr[NameString] = js.undefined
}
object BlueprintRun {
  
  inline def apply(): BlueprintRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueprintRun]
  }
  
  extension [Self <: BlueprintRun](x: Self) {
    
    inline def setBlueprintName(value: OrchestrationNameString): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setBlueprintNameUndefined: Self = StObject.set(x, "BlueprintName", js.undefined)
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setErrorMessage(value: MessageString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setParameters(value: BlueprintParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRoleArn(value: OrchestrationIAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRollbackErrorMessage(value: MessageString): Self = StObject.set(x, "RollbackErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setRollbackErrorMessageUndefined: Self = StObject.set(x, "RollbackErrorMessage", js.undefined)
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setState(value: BlueprintRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setWorkflowName(value: NameString): Self = StObject.set(x, "WorkflowName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowNameUndefined: Self = StObject.set(x, "WorkflowName", js.undefined)
  }
}
