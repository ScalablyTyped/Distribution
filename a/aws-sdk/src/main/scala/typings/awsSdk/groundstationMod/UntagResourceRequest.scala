package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * ARN of a resource.
    */
  var resourceArn: String = js.native
  /**
    * Keys of a resource tag.
    */
  var tagKeys: TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

