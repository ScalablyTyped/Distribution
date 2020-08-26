package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceMessage extends js.Object {
  /**
    * The Amazon RDS resource that the tags are removed from. This value is an Amazon Resource Name (ARN). For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide. 
    */
  var ResourceName: String = js.native
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList = js.native
}

object RemoveTagsFromResourceMessage {
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
  @scala.inline
  implicit class RemoveTagsFromResourceMessageOps[Self <: RemoveTagsFromResourceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceName(value: String): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: KeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

