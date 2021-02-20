package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryStageExecutionOutput extends StObject {
  
  /**
    * The ID of the current workflow execution in the failed stage.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}
object RetryStageExecutionOutput {
  
  @scala.inline
  def apply(): RetryStageExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryStageExecutionOutput]
  }
  
  @scala.inline
  implicit class RetryStageExecutionOutputMutableBuilder[Self <: RetryStageExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
