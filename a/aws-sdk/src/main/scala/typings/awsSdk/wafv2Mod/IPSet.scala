package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn = js.native
  /**
    * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.  Examples:    To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   To configure AWS WAF to allow, block, or count requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify 1111:0000:0000:0000:0000:0000:0000:0111/128.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify 1111:0000:0000:0000:0000:0000:0000:0000/64.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.
    */
  var Addresses: IPAddresses = js.native
  /**
    * A description of the IP set that helps with identification. You cannot change the description of an IP set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * Specify IPV4 or IPV6. 
    */
  var IPAddressVersion: typings.awsSdk.wafv2Mod.IPAddressVersion = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId = js.native
  /**
    * The name of the IP set. You cannot change the name of an IPSet after you create it.
    */
  var Name: EntityName = js.native
}

object IPSet {
  @scala.inline
  def apply(
    ARN: ResourceArn,
    Addresses: IPAddresses,
    IPAddressVersion: IPAddressVersion,
    Id: EntityId,
    Name: EntityName,
    Description: EntityDescription = null
  ): IPSet = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Addresses = Addresses.asInstanceOf[js.Any], IPAddressVersion = IPAddressVersion.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
}

