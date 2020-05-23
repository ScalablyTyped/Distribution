package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortInfo extends js.Object {
  /**
    * An alias that defines access for a preconfigured range of IP addresses. The only alias currently supported is lightsail-connect, which allows IP addresses of the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
    */
  var cidrListAliases: js.UndefOr[StringList] = js.native
  /**
    * The IP address, or range of IP addresses in CIDR notation, that are allowed to connect to an instance through the ports, and the protocol. Lightsail supports IPv4 addresses. Examples:   To allow the IP address 192.0.2.44, specify 192.0.2.44 or 192.0.2.44/32.    To allow the IP addresses 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var cidrs: js.UndefOr[StringList] = js.native
  /**
    * The first port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - 8 (to configure Ping)  Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the fromPort parameter as 8, and the toPort parameter as -1.   
    */
  var fromPort: js.UndefOr[Port] = js.native
  /**
    * The IP protocol name. The name can be one of the following:    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.    icmp - Internet Control Message Protocol (ICMP) is used to send error messages and operational information indicating success or failure when communicating with an instance. For example, an error is indicated when an instance could not be reached.  Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the fromPort parameter as 8, and the toPort parameter as -1.   
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.native
  /**
    * The last port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - -1 (to configure Ping)  Ping is the only communication supported through the ICMP protocol in Lightsail. To configure ping, specify the fromPort parameter as 8, and the toPort parameter as -1.   
    */
  var toPort: js.UndefOr[Port] = js.native
}

object PortInfo {
  @scala.inline
  def apply(
    cidrListAliases: StringList = null,
    cidrs: StringList = null,
    fromPort: js.UndefOr[Port] = js.undefined,
    protocol: NetworkProtocol = null,
    toPort: js.UndefOr[Port] = js.undefined
  ): PortInfo = {
    val __obj = js.Dynamic.literal()
    if (cidrListAliases != null) __obj.updateDynamic("cidrListAliases")(cidrListAliases.asInstanceOf[js.Any])
    if (cidrs != null) __obj.updateDynamic("cidrs")(cidrs.asInstanceOf[js.Any])
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortInfo]
  }
}

