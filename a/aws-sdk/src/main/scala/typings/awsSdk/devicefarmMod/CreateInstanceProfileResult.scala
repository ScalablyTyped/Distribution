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
  def apply(instanceProfile: InstanceProfile = null): CreateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileResult]
  }
}

