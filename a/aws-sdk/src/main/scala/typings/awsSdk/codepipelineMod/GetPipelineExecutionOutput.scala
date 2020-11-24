package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineExecutionOutput extends js.Object {
  
  /**
    * Represents information about the execution of a pipeline.
    */
  var pipelineExecution: js.UndefOr[PipelineExecution] = js.native
}
object GetPipelineExecutionOutput {
  
  @scala.inline
  def apply(): GetPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineExecutionOutput]
  }
  
  @scala.inline
  implicit class GetPipelineExecutionOutputOps[Self <: GetPipelineExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setPipelineExecution(value: PipelineExecution): Self = this.set("pipelineExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineExecution: Self = this.set("pipelineExecution", js.undefined)
  }
}
