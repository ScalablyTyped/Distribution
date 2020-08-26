package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePortState extends js.Object {
  /**
    * An alias that defines access for a preconfigured range of IP addresses. The only alias currently supported is lightsail-connect, which allows IP addresses of the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
    */
  var cidrListAliases: js.UndefOr[StringList] = js.native
  /**
    * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the ports, and the protocol. Lightsail supports IPv4 addresses. For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var cidrs: js.UndefOr[StringList] = js.native
  /**
    * The first port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP type. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.  
    */
  var fromPort: js.UndefOr[Port] = js.native
  /**
    * The IP protocol name. The name can be one of the following:    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.    icmp - Internet Control Message Protocol (ICMP) is used to send error messages and operational information indicating success or failure when communicating with an instance. For example, an error is indicated when an instance could not be reached. When you specify icmp as the protocol, you must specify the ICMP type using the fromPort parameter, and ICMP code using the toPort parameter.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.native
  /**
    * Specifies whether the instance port is open or closed.  The port state for Lightsail instances is always open. 
    */
  var state: js.UndefOr[PortState] = js.native
  /**
    * The last port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP code. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.  
    */
  var toPort: js.UndefOr[Port] = js.native
}

object InstancePortState {
  @scala.inline
  def apply(): InstancePortState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePortState]
  }
  @scala.inline
  implicit class InstancePortStateOps[Self <: InstancePortState] (val x: Self) extends AnyVal {
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
    def setCidrListAliasesVarargs(value: String*): Self = this.set("cidrListAliases", js.Array(value :_*))
    @scala.inline
    def setCidrListAliases(value: StringList): Self = this.set("cidrListAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrListAliases: Self = this.set("cidrListAliases", js.undefined)
    @scala.inline
    def setCidrsVarargs(value: String*): Self = this.set("cidrs", js.Array(value :_*))
    @scala.inline
    def setCidrs(value: StringList): Self = this.set("cidrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrs: Self = this.set("cidrs", js.undefined)
    @scala.inline
    def setFromPort(value: Port): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("fromPort", js.undefined)
    @scala.inline
    def setProtocol(value: NetworkProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setState(value: PortState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setToPort(value: Port): Self = this.set("toPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("toPort", js.undefined)
  }
  
}

