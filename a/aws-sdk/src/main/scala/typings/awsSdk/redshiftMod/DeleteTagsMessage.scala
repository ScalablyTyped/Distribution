package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) from which you want to remove the tag or tags. For example, arn:aws:redshift:us-east-2:123456789:cluster:t1. 
    */
  var ResourceName: String = js.native
  /**
    * The tag key that you want to delete.
    */
  var TagKeys: TagKeyList = js.native
}

object DeleteTagsMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: TagKeyList): DeleteTagsMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTagsMessage]
  }
}

