package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The keys of the tags to remove.
    */
  var tagKeys: stringList = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(pipelineId: id, tagKeys: stringList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  @scala.inline
  implicit class RemoveTagsInputOps[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
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
    def setTagKeysVarargs(value: String*): Self = this.set("tagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: stringList): Self = this.set("tagKeys", value.asInstanceOf[js.Any])
  }
  
}

