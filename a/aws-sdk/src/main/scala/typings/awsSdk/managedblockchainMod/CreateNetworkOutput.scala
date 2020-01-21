package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkOutput extends js.Object {
  /**
    * The unique identifier for the first member within the network.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    * The unique identifier for the network.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
}

object CreateNetworkOutput {
  @scala.inline
  def apply(MemberId: ResourceIdString = null, NetworkId: ResourceIdString = null): CreateNetworkOutput = {
    val __obj = js.Dynamic.literal()
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId.asInstanceOf[js.Any])
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkOutput]
  }
}

