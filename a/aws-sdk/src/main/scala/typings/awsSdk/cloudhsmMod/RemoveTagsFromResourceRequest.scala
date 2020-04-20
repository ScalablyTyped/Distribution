package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
    */
  var ResourceArn: String = js.native
  /**
    * The tag key or keys to remove. Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  var TagKeyList: typings.awsSdk.cloudhsmMod.TagKeyList = js.native
}

object RemoveTagsFromResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, TagKeyList: TagKeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
}

