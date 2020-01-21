package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsSdk.opsworksMod.ResourceArn = js.native
  /**
    * A list of the keys of tags to be removed from a stack or layer.
    */
  var TagKeys: typings.awsSdk.opsworksMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

