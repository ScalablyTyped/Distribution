package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  /**
    * [TLS listener] The name of the Application-Layer Protocol Negotiation (ALPN) policy.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.undefined
  
  /**
    * [HTTPS or TLS listener] The default certificate for the listener.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    * The default actions for the listener.
    */
  var DefaultActions: js.UndefOr[Actions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.undefined
  
  /**
    * The port on which the load balancer is listening.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.undefined
  
  /**
    * The protocol for connections from clients to the load balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTPS or TLS listener] The security policy that defines which protocols and ciphers are supported.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
}
object Listener {
  
  @scala.inline
  def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpnPolicy(value: AlpnPolicyName): Self = StObject.set(x, "AlpnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlpnPolicyUndefined: Self = StObject.set(x, "AlpnPolicy", js.undefined)
    
    @scala.inline
    def setAlpnPolicyVarargs(value: AlpnPolicyValue*): Self = StObject.set(x, "AlpnPolicy", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActions(value: Actions): Self = StObject.set(x, "DefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActionsUndefined: Self = StObject.set(x, "DefaultActions", js.undefined)
    
    @scala.inline
    def setDefaultActionsVarargs(value: Action*): Self = StObject.set(x, "DefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArnUndefined: Self = StObject.set(x, "ListenerArn", js.undefined)
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: ProtocolEnum): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setSslPolicy(value: SslPolicyName): Self = StObject.set(x, "SslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPolicyUndefined: Self = StObject.set(x, "SslPolicy", js.undefined)
  }
}
