package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostedConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. Note that only those AWS Direct Connect Partners who have met specific requirements are allowed to create a 1Gbps, 2Gbps, 5Gbps or 10Gbps hosted connection. 
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The ID of the interconnect or LAG.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The name of the hosted connection.
    */
  var connectionName: ConnectionName = js.native
  /**
    * The ID of the AWS account ID of the customer for the connection.
    */
  var ownerAccount: OwnerAccount = js.native
  /**
    * The tags associated with the connection.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The dedicated VLAN provisioned to the hosted connection.
    */
  var vlan: VLAN = js.native
}

object AllocateHostedConnectionRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionId: ConnectionId,
    connectionName: ConnectionName,
    ownerAccount: OwnerAccount,
    vlan: VLAN,
    tags: TagList = null
  ): AllocateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostedConnectionRequest]
  }
}

