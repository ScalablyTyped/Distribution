package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.native
}

object CreateInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType): CreateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileRequest]
  }
  @scala.inline
  implicit class CreateInstanceProfileRequestOps[Self <: CreateInstanceProfileRequest] (val x: Self) extends AnyVal {
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
    def setInstanceProfileName(value: instanceProfileNameType): Self = this.set("InstanceProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

