package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which to remove the tags.
    */
  var ResourceArn: GlueResourceArn = js.native
  /**
    * Tags to remove from this resource.
    */
  var TagsToRemove: TagKeysList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToRemove: TagKeysList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsToRemove = TagsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

