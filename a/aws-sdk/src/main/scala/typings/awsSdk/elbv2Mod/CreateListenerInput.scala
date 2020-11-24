package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateListenerInput extends js.Object {
  
  /**
    * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy name. The following are the possible values:    HTTP1Only     HTTP2Only     HTTP2Optional     HTTP2Preferred     None    For more information, see ALPN policies in the Network Load Balancers Guide.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.native
  
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  
  /**
    * The actions for the default rule.
    */
  var DefaultActions: Actions = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
  
  /**
    * The port on which the load balancer is listening. You cannot specify a port for a Gateway Load Balancer.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.native
  
  /**
    * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP. You can’t specify the UDP or TCP_UDP protocol if dual-stack mode is enabled. You cannot specify a protocol for a Gateway Load Balancer.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. For more information, see Security policies in the Application Load Balancers Guide and Security policies in the Network Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.native
  
  /**
    * The tags to assign to the listener.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateListenerInput {
  
  @scala.inline
  def apply(DefaultActions: Actions, LoadBalancerArn: LoadBalancerArn): CreateListenerInput = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerInput]
  }
  
  @scala.inline
  implicit class CreateListenerInputOps[Self <: CreateListenerInput] (val x: Self) extends AnyVal {
    
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
    def setDefaultActionsVarargs(value: Action*): Self = this.set("DefaultActions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActions(value: Actions): Self = this.set("DefaultActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
