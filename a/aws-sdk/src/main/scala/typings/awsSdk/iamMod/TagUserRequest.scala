package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagUserRequest extends js.Object {
  /**
    * The list of tags that you want to attach to the user. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType = js.native
  /**
    * The name of the user that you want to add tags to. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType = js.native
}

object TagUserRequest {
  @scala.inline
  def apply(Tags: tagListType, UserName: existingUserNameType): TagUserRequest = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagUserRequest]
  }
  @scala.inline
  implicit class TagUserRequestOps[Self <: TagUserRequest] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

