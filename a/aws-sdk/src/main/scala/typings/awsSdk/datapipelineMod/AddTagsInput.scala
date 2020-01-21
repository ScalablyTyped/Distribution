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
}

