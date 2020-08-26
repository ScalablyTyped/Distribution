package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The tags to add, as key/value pairs.
    */
  var tags: tagList = js.native
}

object AddTagsInput {
  @scala.inline
  def apply(pipelineId: id, tags: tagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsInput]
  }
  @scala.inline
  implicit class AddTagsInputOps[Self <: AddTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

