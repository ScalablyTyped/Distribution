package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineOutput extends js.Object {
  /**
    * Represents the pipeline metadata information returned as part of the output of a GetPipeline action.
    */
  var metadata: js.UndefOr[PipelineMetadata] = js.native
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
}

object GetPipelineOutput {
  @scala.inline
  def apply(): GetPipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineOutput]
  }
  @scala.inline
  implicit class GetPipelineOutputOps[Self <: GetPipelineOutput] (val x: Self) extends AnyVal {
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
    def setMetadata(value: PipelineMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
  }
  
}

