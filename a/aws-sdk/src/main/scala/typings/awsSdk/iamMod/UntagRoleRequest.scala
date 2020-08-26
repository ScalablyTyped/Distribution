package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagRoleRequest extends js.Object {
  /**
    * The name of the IAM role from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
    */
  var TagKeys: tagKeyListType = js.native
}

object UntagRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType, TagKeys: tagKeyListType): UntagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagRoleRequest]
  }
  @scala.inline
  implicit class UntagRoleRequestOps[Self <: UntagRoleRequest] (val x: Self) extends AnyVal {
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
    def setTagKeysVarargs(value: tagKeyType*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: tagKeyListType): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

