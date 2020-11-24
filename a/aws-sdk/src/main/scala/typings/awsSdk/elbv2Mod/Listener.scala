package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  
  /**
    * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.native
  
  /**
    * [HTTPS or TLS listener] The default certificate for the listener.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  
  /**
    * The default actions for the listener.
    */
  var DefaultActions: js.UndefOr[Actions] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArn] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.native
  
  /**
    * The port on which the load balancer is listening.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.native
  
  /**
    * The protocol for connections from clients to the load balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  
  /**
    * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.native
}
object Listener {
  
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    
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
    def setAlpnPolicyVarargs(value: AlpnPolicyValue*): Self = this.set("AlpnPolicy", js.Array(value :_*))
    
    @scala.inline
    def setAlpnPolicy(value: AlpnPolicyName): Self = this.set("AlpnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpnPolicy: Self = this.set("AlpnPolicy", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = this.set("Certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = this.set("Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("Certificates", js.undefined)
    
    @scala.inline
    def setDefaultActionsVarargs(value: Action*): Self = this.set("DefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActions(value: Actions): Self = this.set("DefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActions: Self = this.set("DefaultActions", js.undefined)
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerArn: Self = this.set("ListenerArn", js.undefined)
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerArn: Self = this.set("LoadBalancerArn", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: ProtocolEnum): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setSslPolicy(value: SslPolicyName): Self = this.set("SslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPolicy: Self = this.set("SslPolicy", js.undefined)
  }
}
