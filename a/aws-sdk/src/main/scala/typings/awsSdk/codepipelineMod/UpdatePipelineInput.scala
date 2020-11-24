package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePipelineInput extends js.Object {
  
  /**
    * The name of the pipeline to be updated.
    */
  var pipeline: PipelineDeclaration = js.native
}
object UpdatePipelineInput {
  
  @scala.inline
  def apply(pipeline: PipelineDeclaration): UpdatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineInput]
  }
  
  @scala.inline
  implicit class UpdatePipelineInputOps[Self <: UpdatePipelineInput] (val x: Self) extends AnyVal {
    
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
    def setPipeline(value: PipelineDeclaration): Self = this.set("pipeline", value.asInstanceOf[js.Any])
  }
}
