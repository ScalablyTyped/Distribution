package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  /**
    * The port on which the instance is listening.
    */
  var InstancePort: typings.awsSdk.elbMod.InstancePort = js.native
  /**
    * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL. If the front-end protocol is HTTP, HTTPS, TCP, or SSL, InstanceProtocol must be at the same protocol. If there is another listener with the same InstancePort whose InstanceProtocol is secure, (HTTPS or SSL), the listener's InstanceProtocol must also be secure. If there is another listener with the same InstancePort whose InstanceProtocol is HTTP or TCP, the listener's InstanceProtocol must be HTTP or TCP.
    */
  var InstanceProtocol: js.UndefOr[Protocol] = js.native
  /**
    * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
    */
  var LoadBalancerPort: AccessPointPort = js.native
  /**
    * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
    */
  var Protocol: typings.awsSdk.elbMod.Protocol = js.native
  /**
    * The Amazon Resource Name (ARN) of the server certificate.
    */
  var SSLCertificateId: js.UndefOr[typings.awsSdk.elbMod.SSLCertificateId] = js.native
}

object Listener {
  @scala.inline
  def apply(
    InstancePort: InstancePort,
    LoadBalancerPort: AccessPointPort,
    Protocol: Protocol,
    InstanceProtocol: Protocol = null,
    SSLCertificateId: SSLCertificateId = null
  ): Listener = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    if (InstanceProtocol != null) __obj.updateDynamic("InstanceProtocol")(InstanceProtocol.asInstanceOf[js.Any])
    if (SSLCertificateId != null) __obj.updateDynamic("SSLCertificateId")(SSLCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}

