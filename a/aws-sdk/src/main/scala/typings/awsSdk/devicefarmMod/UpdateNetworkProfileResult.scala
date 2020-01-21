package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNetworkProfileResult extends js.Object {
  /**
    * A list of the available network profiles.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}

object UpdateNetworkProfileResult {
  @scala.inline
  def apply(networkProfile: NetworkProfile = null): UpdateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkProfileResult]
  }
}

