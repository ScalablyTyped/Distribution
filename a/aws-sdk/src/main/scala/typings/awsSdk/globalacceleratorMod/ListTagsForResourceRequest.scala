package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to list tags for. An ARN uniquely identifies an accelerator.
    */
  var ResourceArn: typings.awsSdk.globalacceleratorMod.ResourceArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

