package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Cloud9 development environment to remove tags from.
    */
  var ResourceARN: EnvironmentArn = js.native
  /**
    * The tag names of the tags to remove from the given AWS Cloud9 development environment.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: EnvironmentArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

