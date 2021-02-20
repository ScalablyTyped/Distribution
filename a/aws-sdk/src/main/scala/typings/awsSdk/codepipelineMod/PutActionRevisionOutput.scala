package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutActionRevisionOutput extends StObject {
  
  /**
    * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the current workflow state of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}
object PutActionRevisionOutput {
  
  @scala.inline
  def apply(): PutActionRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutActionRevisionOutput]
  }
  
  @scala.inline
  implicit class PutActionRevisionOutputMutableBuilder[Self <: PutActionRevisionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewRevision(value: Boolean): Self = StObject.set(x, "newRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRevisionUndefined: Self = StObject.set(x, "newRevision", js.undefined)
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
