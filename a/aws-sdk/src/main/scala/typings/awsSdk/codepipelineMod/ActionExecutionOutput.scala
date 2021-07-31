package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionOutput extends StObject {
  
  /**
    * Execution result information listed in the output details for an action execution.
    */
  var executionResult: js.UndefOr[ActionExecutionResult] = js.undefined
  
  /**
    * Details of output artifacts of the action that correspond to the action execution.
    */
  var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
  
  /**
    * The outputVariables field shows the key-value pairs that were output as part of that execution.
    */
  var outputVariables: js.UndefOr[OutputVariablesMap] = js.undefined
}
object ActionExecutionOutput {
  
  @scala.inline
  def apply(): ActionExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionOutput]
  }
  
  @scala.inline
  implicit class ActionExecutionOutputMutableBuilder[Self <: ActionExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionResult(value: ActionExecutionResult): Self = StObject.set(x, "executionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionResultUndefined: Self = StObject.set(x, "executionResult", js.undefined)
    
    @scala.inline
    def setOutputArtifacts(value: ArtifactDetailList): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactsUndefined: Self = StObject.set(x, "outputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputArtifactsVarargs(value: ArtifactDetail*): Self = StObject.set(x, "outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputVariables(value: OutputVariablesMap): Self = StObject.set(x, "outputVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVariablesUndefined: Self = StObject.set(x, "outputVariables", js.undefined)
  }
}
