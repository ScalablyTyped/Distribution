package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetwork] = js.native
}

object UpdateGlobalNetworkResponse {
  @scala.inline
  def apply(GlobalNetwork: GlobalNetwork = null): UpdateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetwork != null) __obj.updateDynamic("GlobalNetwork")(GlobalNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalNetworkResponse]
  }
}

