package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * An AWS DMS resource from which you want to remove tag(s). The value for this parameter is an Amazon Resource Name (ARN).
    */
  var ResourceArn: String = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList = js.native
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceArn: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
}

