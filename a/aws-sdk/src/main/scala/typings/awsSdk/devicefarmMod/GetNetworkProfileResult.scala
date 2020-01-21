package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileResult extends js.Object {
  /**
    * The network profile.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}

object GetNetworkProfileResult {
  @scala.inline
  def apply(networkProfile: NetworkProfile = null): GetNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkProfileResult]
  }
}

