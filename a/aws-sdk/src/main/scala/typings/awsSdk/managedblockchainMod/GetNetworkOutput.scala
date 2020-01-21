package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkOutput extends js.Object {
  /**
    * An object containing network configuration parameters.
    */
  var Network: js.UndefOr[typings.awsSdk.managedblockchainMod.Network] = js.native
}

object GetNetworkOutput {
  @scala.inline
  def apply(Network: Network = null): GetNetworkOutput = {
    val __obj = js.Dynamic.literal()
    if (Network != null) __obj.updateDynamic("Network")(Network.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkOutput]
  }
}

