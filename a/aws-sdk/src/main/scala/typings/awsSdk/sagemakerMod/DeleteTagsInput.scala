package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to delete.
    */
  var ResourceArn: typings.awsSdk.sagemakerMod.ResourceArn = js.native
  /**
    * An array or one or more tag keys to delete.
    */
  var TagKeys: TagKeyList = js.native
}

object DeleteTagsInput {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsInput]
  }
}

