package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewPublicVirtualInterfaceAllocation extends js.Object {
  
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
    * The routes to be advertised to the AWS network in this Region. Applies to public virtual interfaces.
    */
  var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The tags associated with the public virtual interface.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the virtual interface assigned by the customer network. The name has a maximum of 100 characters. The following are valid characters: a-z, 0-9 and a hyphen (-).
    */
  var virtualInterfaceName: VirtualInterfaceName = js.native
  
  /**
    * The ID of the VLAN.
    */
  var vlan: VLAN = js.native
}
object NewPublicVirtualInterfaceAllocation {
  
  @scala.inline
  def apply(asn: ASN, virtualInterfaceName: VirtualInterfaceName, vlan: VLAN): NewPublicVirtualInterfaceAllocation = {
    val __obj = js.Dynamic.literal(asn = asn.asInstanceOf[js.Any], virtualInterfaceName = virtualInterfaceName.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewPublicVirtualInterfaceAllocation]
  }
  
  @scala.inline
  implicit class NewPublicVirtualInterfaceAllocationOps[Self <: NewPublicVirtualInterfaceAllocation] (val x: Self) extends AnyVal {
    
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
    def setAsn(value: ASN): Self = this.set("asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceName(value: VirtualInterfaceName): Self = this.set("virtualInterfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlan(value: VLAN): Self = this.set("vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFamily(value: AddressFamily): Self = this.set("addressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressFamily: Self = this.set("addressFamily", js.undefined)
    
    @scala.inline
    def setAmazonAddress(value: AmazonAddress): Self = this.set("amazonAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonAddress: Self = this.set("amazonAddress", js.undefined)
    
    @scala.inline
    def setAuthKey(value: BGPAuthKey): Self = this.set("authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: CustomerAddress): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    
    @scala.inline
    def setRouteFilterPrefixesVarargs(value: RouteFilterPrefix*): Self = this.set("routeFilterPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setRouteFilterPrefixes(value: RouteFilterPrefixList): Self = this.set("routeFilterPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteFilterPrefixes: Self = this.set("routeFilterPrefixes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
