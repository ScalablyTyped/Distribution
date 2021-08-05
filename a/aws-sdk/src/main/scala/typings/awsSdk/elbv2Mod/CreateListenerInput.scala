package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerInput extends StObject {
  
  /**
    * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy name. The following are the possible values:    HTTP1Only     HTTP2Only     HTTP2Optional     HTTP2Preferred     None    For more information, see ALPN policies in the Network Load Balancers Guide.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.undefined
  
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  
  /**
    * The actions for the default rule.
    */
  var DefaultActions: Actions
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn
  
  /**
    * The port on which the load balancer is listening. You cannot specify a port for a Gateway Load Balancer.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.undefined
  
  /**
    * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load Balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. For more information, see Security policies in the Application Load Balancers Guide and Security policies in the Network Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
  
  /**
    * The tags to assign to the listener.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateListenerInput {
  
  inline def apply(DefaultActions: Actions, LoadBalancerArn: LoadBalancerArn): CreateListenerInput = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerInput]
  }
  
  extension [Self <: CreateListenerInput](x: Self) {
    
    inline def setAlpnPolicy(value: AlpnPolicyName): Self = StObject.set(x, "AlpnPolicy", value.asInstanceOf[js.Any])
    
    inline def setAlpnPolicyUndefined: Self = StObject.set(x, "AlpnPolicy", js.undefined)
    
    inline def setAlpnPolicyVarargs(value: AlpnPolicyValue*): Self = StObject.set(x, "AlpnPolicy", js.Array(value :_*))
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
    
    inline def setDefaultActions(value: Actions): Self = StObject.set(x, "DefaultActions", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionsVarargs(value: Action*): Self = StObject.set(x, "DefaultActions", js.Array(value :_*))
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: ProtocolEnum): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSslPolicy(value: SslPolicyName): Self = StObject.set(x, "SslPolicy", value.asInstanceOf[js.Any])
    
    inline def setSslPolicyUndefined: Self = StObject.set(x, "SslPolicy", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
