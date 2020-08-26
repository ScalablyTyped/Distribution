package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalGatewayVirtualInterface extends js.Object {
  /**
    * The local address.
    */
  var LocalAddress: js.UndefOr[String] = js.native
  /**
    * The Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the local gateway.
    */
  var LocalBgpAsn: js.UndefOr[Integer] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual interface.
    */
  var LocalGatewayVirtualInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceId] = js.native
  /**
    * The peer address.
    */
  var PeerAddress: js.UndefOr[String] = js.native
  /**
    * The peer BGP ASN.
    */
  var PeerBgpAsn: js.UndefOr[Integer] = js.native
  /**
    * The tags assigned to the virtual interface.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VLAN.
    */
  var Vlan: js.UndefOr[Integer] = js.native
}

object LocalGatewayVirtualInterface {
  @scala.inline
  def apply(): LocalGatewayVirtualInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGatewayVirtualInterface]
  }
  @scala.inline
  implicit class LocalGatewayVirtualInterfaceOps[Self <: LocalGatewayVirtualInterface] (val x: Self) extends AnyVal {
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
    def setLocalAddress(value: String): Self = this.set("LocalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("LocalAddress", js.undefined)
    @scala.inline
    def setLocalBgpAsn(value: Integer): Self = this.set("LocalBgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalBgpAsn: Self = this.set("LocalBgpAsn", js.undefined)
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("LocalGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("LocalGatewayId", js.undefined)
    @scala.inline
    def setLocalGatewayVirtualInterfaceId(value: LocalGatewayVirtualInterfaceId): Self = this.set("LocalGatewayVirtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceId: Self = this.set("LocalGatewayVirtualInterfaceId", js.undefined)
    @scala.inline
    def setPeerAddress(value: String): Self = this.set("PeerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerAddress: Self = this.set("PeerAddress", js.undefined)
    @scala.inline
    def setPeerBgpAsn(value: Integer): Self = this.set("PeerBgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerBgpAsn: Self = this.set("PeerBgpAsn", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVlan(value: Integer): Self = this.set("Vlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVlan: Self = this.set("Vlan", js.undefined)
  }
  
}

