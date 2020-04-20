package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Global Accelerator resource to remove tags from. An ARN uniquely identifies a resource.
    */
  var ResourceArn: typings.awsSdk.globalacceleratorMod.ResourceArn = js.native
  /**
    * The tag key pairs that you want to remove from the specified resources.
    */
  var TagKeys: typings.awsSdk.globalacceleratorMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

