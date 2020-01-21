package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName = js.native
  /**
    * A list of the keys of the tags to be removed from the resource.
    */
  var tagKeys: TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: AmazonResourceName, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

