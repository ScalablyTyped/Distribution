package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  /**
    * The port on which the instance is listening.
    */
  var InstancePort: typings.awsSdk.elbMod.InstancePort
  
  /**
    * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL. If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS. If there is another listener with the same InstancePort whose InstanceProtocol is secure, (HTTPS or SSL), the listener's InstanceProtocol must also be secure. If there is another listener with the same InstancePort whose InstanceProtocol is HTTP or TCP, the listener's InstanceProtocol must be HTTP or TCP.
    */
  var InstanceProtocol: js.UndefOr[Protocol] = js.undefined
  
  /**
    * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
    */
  var LoadBalancerPort: AccessPointPort
  
  /**
    * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
    */
  var Protocol: typings.awsSdk.elbMod.Protocol
  
  /**
    * The Amazon Resource Name (ARN) of the server certificate.
    */
  var SSLCertificateId: js.UndefOr[typings.awsSdk.elbMod.SSLCertificateId] = js.undefined
}
object Listener {
  
  @scala.inline
  def apply(InstancePort: InstancePort, LoadBalancerPort: AccessPointPort, Protocol: Protocol): Listener = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstancePort(value: InstancePort): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProtocol(value: Protocol): Self = StObject.set(x, "InstanceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProtocolUndefined: Self = StObject.set(x, "InstanceProtocol", js.undefined)
    
    @scala.inline
    def setLoadBalancerPort(value: AccessPointPort): Self = StObject.set(x, "LoadBalancerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSLCertificateId(value: SSLCertificateId): Self = StObject.set(x, "SSLCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSLCertificateIdUndefined: Self = StObject.set(x, "SSLCertificateId", js.undefined)
  }
}
