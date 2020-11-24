package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecutionOutput extends js.Object {
  
  /**
    * Execution result information listed in the output details for an action execution.
    */
  var executionResult: js.UndefOr[ActionExecutionResult] = js.native
  
  /**
    * Details of output artifacts of the action that correspond to the action execution.
    */
  var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  
  /**
    * The outputVariables field shows the key-value pairs that were output as part of that execution.
    */
  var outputVariables: js.UndefOr[OutputVariablesMap] = js.native
}
object ActionExecutionOutput {
  
  @scala.inline
  def apply(): ActionExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionOutput]
  }
  
  @scala.inline
  implicit class ActionExecutionOutputOps[Self <: ActionExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setExecutionResult(value: ActionExecutionResult): Self = this.set("executionResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionResult: Self = this.set("executionResult", js.undefined)
    
    @scala.inline
    def setOutputArtifactsVarargs(value: ArtifactDetail*): Self = this.set("outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: ArtifactDetailList): Self = this.set("outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("outputArtifacts", js.undefined)
    
    @scala.inline
    def setOutputVariables(value: OutputVariablesMap): Self = this.set("outputVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputVariables: Self = this.set("outputVariables", js.undefined)
  }
}
