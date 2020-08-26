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
    vlan: VLAN
  ): AllocateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostedConnectionRequest]
  }
  @scala.inline
  implicit class AllocateHostedConnectionRequestOps[Self <: AllocateHostedConnectionRequest] (val x: Self) extends AnyVal {
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
    def setBandwidth(value: Bandwidth): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVlan(value: VLAN): Self = this.set("vlan", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

