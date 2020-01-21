package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewPrivateVirtualInterfaceAllocation extends js.Object {
  /**
    * The address family for the BGP peer.
    */
  var addressFamily: js.UndefOr[AddressFamily] = js.native
  /**
    * The IP address assigned to the Amazon interface.
    */
  var amazonAddress: js.UndefOr[AmazonAddress] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration. The valid values are 1-2147483647.
    */
  var asn: ASN = js.native
  /**
    * The authentication key for BGP configuration. This string has a minimum length of 6 characters and and a maximun lenth of 80 characters.
    */
  var authKey: js.UndefOr[BGPAuthKey] = js.native
  /**
    * The IP address assigned to the customer interface.
    */
  var customerAddress: js.UndefOr[CustomerAddress] = js.native
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  /**
    * The tags associated with the private virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the virtual interface assigned by the customer network.
    */
  var virtualInterfaceName: VirtualInterfaceName = js.native
  /**
    * The ID of the VLAN.
    */
  var vlan: VLAN = js.native
}

object NewPrivateVirtualInterfaceAllocation {
  @scala.inline
  def apply(
    asn: ASN,
    virtualInterfaceName: VirtualInterfaceName,
    vlan: VLAN,
    addressFamily: AddressFamily = null,
    amazonAddress: AmazonAddress = null,
    authKey: BGPAuthKey = null,
    customerAddress: CustomerAddress = null,
    mtu: Int | Double = null,
    tags: TagList = null
  ): NewPrivateVirtualInterfaceAllocation = {
    val __obj = js.Dynamic.literal(asn = asn.asInstanceOf[js.Any], virtualInterfaceName = virtualInterfaceName.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    if (addressFamily != null) __obj.updateDynamic("addressFamily")(addressFamily.asInstanceOf[js.Any])
    if (amazonAddress != null) __obj.updateDynamic("amazonAddress")(amazonAddress.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (customerAddress != null) __obj.updateDynamic("customerAddress")(customerAddress.asInstanceOf[js.Any])
    if (mtu != null) __obj.updateDynamic("mtu")(mtu.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPrivateVirtualInterfaceAllocation]
  }
}

