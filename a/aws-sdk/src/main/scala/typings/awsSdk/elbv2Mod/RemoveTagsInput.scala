package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typings.awsSdk.elbv2Mod.ResourceArns = js.native
  /**
    * The tag keys for the tags to remove.
    */
  var TagKeys: typings.awsSdk.elbv2Mod.TagKeys = js.native
}

object RemoveTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns, TagKeys: TagKeys): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsInput]
  }
}

