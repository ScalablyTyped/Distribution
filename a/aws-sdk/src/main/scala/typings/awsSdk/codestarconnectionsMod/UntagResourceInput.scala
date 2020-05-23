package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to remove tags from.
    */
  var ResourceArn: AmazonResourceName = js.native
  /**
    * The list of keys for the tags to be removed from the resource.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}

