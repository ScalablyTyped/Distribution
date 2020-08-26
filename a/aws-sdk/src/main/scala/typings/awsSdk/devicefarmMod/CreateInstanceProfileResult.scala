package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceProfileResult extends js.Object {
  /**
    * An object that contains information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}

object CreateInstanceProfileResult {
  @scala.inline
  def apply(): CreateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceProfileResult]
  }
  @scala.inline
  implicit class CreateInstanceProfileResultOps[Self <: CreateInstanceProfileResult] (val x: Self) extends AnyVal {
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
    def setInstanceProfile(value: InstanceProfile): Self = this.set("instanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceProfile: Self = this.set("instanceProfile", js.undefined)
  }
  
}

