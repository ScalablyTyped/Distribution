package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineInput extends js.Object {
  /**
    * Represents the structure of actions and stages to be performed in the pipeline. 
    */
  var pipeline: PipelineDeclaration = js.native
  /**
    * The tags for the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreatePipelineInput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration): CreatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineInput]
  }
  @scala.inline
  implicit class CreatePipelineInputOps[Self <: CreatePipelineInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

