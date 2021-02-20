package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// VPN Provider
////////////////////
/**
  * Use the chrome.vpnProvider API to implement a VPN client.
  * Permissions:  "vpnProvider"
  * Important: This API works only on Chrome OS.
  * @since Chrome 43.
  */
object vpnProvider {
  
  type VpnConfigCreationEvent = Event[js.Function3[/* id */ String, /* name */ String, /* data */ js.Object, Unit]]
  
  type VpnConfigRemovalEvent = Event[js.Function1[/* id */ String, Unit]]
  
  type VpnPacketReceptionEvent = Event[js.Function1[/* data */ ArrayBuffer, Unit]]
  
  type VpnPlatformMessageEvent = Event[js.Function3[/* id */ String, /* message */ String, /* error */ String, Unit]]
  
  @js.native
  trait VpnSessionParameters extends StObject {
    
    /** IP address for the VPN interface in CIDR notation. IPv4 is currently the only supported mode. */
    var address: String = js.native
    
    /** Optional. Broadcast address for the VPN interface. (default: deduced from IP address and mask) */
    var broadcastAddress: js.UndefOr[String] = js.native
    
    /** A list of IPs for the DNS servers. */
    var dnsServer: js.Array[String] = js.native
    
    /** Optional. A list of search domains. (default: no search domain) */
    var domainSearch: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Exclude network traffic to the list of IP blocks in CIDR notation from the tunnel. This can be used to bypass traffic to and from the VPN server. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
      */
    var exclusionList: js.Array[String] = js.native
    
    /**
      * Include network traffic to the list of IP blocks in CIDR notation to the tunnel. This parameter can be used to set up a split tunnel. By default no traffic is directed to the tunnel. Adding the entry "0.0.0.0/0" to this list gets all the user traffic redirected to the tunnel. When many rules match a destination, the rule with the longest matching prefix wins. Entries that correspond to the same CIDR block are treated as duplicates. Such duplicates in the collated (exclusionList + inclusionList) list are eliminated and the exact duplicate entry that will be eliminated is undefined.
      */
    var inclusionList: js.Array[String] = js.native
    
    /** Optional. MTU setting for the VPN interface. (default: 1500 bytes) */
    var mtu: js.UndefOr[String] = js.native
  }
  object VpnSessionParameters {
    
    @scala.inline
    def apply(
      address: String,
      dnsServer: js.Array[String],
      exclusionList: js.Array[String],
      inclusionList: js.Array[String]
    ): VpnSessionParameters = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dnsServer = dnsServer.asInstanceOf[js.Any], exclusionList = exclusionList.asInstanceOf[js.Any], inclusionList = inclusionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpnSessionParameters]
    }
    
    @scala.inline
    implicit class VpnSessionParametersMutableBuilder[Self <: VpnSessionParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcastAddress(value: String): Self = StObject.set(x, "broadcastAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcastAddressUndefined: Self = StObject.set(x, "broadcastAddress", js.undefined)
      
      @scala.inline
      def setDnsServer(value: js.Array[String]): Self = StObject.set(x, "dnsServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsServerVarargs(value: String*): Self = StObject.set(x, "dnsServer", js.Array(value :_*))
      
      @scala.inline
      def setDomainSearch(value: js.Array[String]): Self = StObject.set(x, "domainSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainSearchUndefined: Self = StObject.set(x, "domainSearch", js.undefined)
      
      @scala.inline
      def setDomainSearchVarargs(value: String*): Self = StObject.set(x, "domainSearch", js.Array(value :_*))
      
      @scala.inline
      def setExclusionList(value: js.Array[String]): Self = StObject.set(x, "exclusionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusionListVarargs(value: String*): Self = StObject.set(x, "exclusionList", js.Array(value :_*))
      
      @scala.inline
      def setInclusionList(value: js.Array[String]): Self = StObject.set(x, "inclusionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusionListVarargs(value: String*): Self = StObject.set(x, "inclusionList", js.Array(value :_*))
      
      @scala.inline
      def setMtu(value: String): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    }
  }
  
  type VpnUiEvent = Event[js.Function2[/* event */ String, /* id */ js.UndefOr[String], Unit]]
}
