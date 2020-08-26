package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRoleRequest extends js.Object {
  /**
    * The name of the role that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
  /**
    * The list of tags that you want to attach to the role. Each tag consists of a key name and an associated value. You can specify this with a JSON string.
    */
  var Tags: tagListType = js.native
}

object TagRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType, Tags: tagListType): TagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRoleRequest]
  }
  @scala.inline
  implicit class TagRoleRequestOps[Self <: TagRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

