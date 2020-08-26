package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceProfileResponse extends js.Object {
  /**
    * A structure containing details about the new instance profile.
    */
  var InstanceProfile: typings.awsSdk.iamMod.InstanceProfile = js.native
}

object CreateInstanceProfileResponse {
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): CreateInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileResponse]
  }
  @scala.inline
  implicit class CreateInstanceProfileResponseOps[Self <: CreateInstanceProfileResponse] (val x: Self) extends AnyVal {
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
    def setInstanceProfile(value: InstanceProfile): Self = this.set("InstanceProfile", value.asInstanceOf[js.Any])
  }
  
}

