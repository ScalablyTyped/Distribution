package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateListenerInput extends js.Object {
  /**
    * [TLS listeners] The name of the Application-Layer Protocol Negotiation (ALPN) policy. You can specify one policy name. The following are the possible values:    HTTP1Only     HTTP2Only     HTTP2Optional     HTTP2Preferred     None    For more information, see ALPN Policies in the Network Load Balancers Guide.
    */
  var AlpnPolicy: js.UndefOr[AlpnPolicyName] = js.native
  /**
    * [HTTPS and TLS listeners] The default certificate for the listener. You must provide exactly one certificate. Set CertificateArn to the certificate ARN but do not set IsDefault. To create a certificate list for the listener, use AddListenerCertificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    * The actions for the default rule. The rule must include one forward action or one or more fixed-response actions. If the action type is forward, you specify one or more target groups. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var DefaultActions: Actions = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
  /**
    * The port on which the load balancer is listening.
    */
  var Port: typings.awsSdk.elbv2Mod.Port = js.native
  /**
    * The protocol for connections from clients to the load balancer. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, and TCP_UDP.
    */
  var Protocol: ProtocolEnum = js.native
  /**
    * [HTTPS and TLS listeners] The security policy that defines which protocols and ciphers are supported. The following are the possible values:    ELBSecurityPolicy-2016-08     ELBSecurityPolicy-TLS-1-0-2015-04     ELBSecurityPolicy-TLS-1-1-2017-01     ELBSecurityPolicy-TLS-1-2-2017-01     ELBSecurityPolicy-TLS-1-2-Ext-2018-06     ELBSecurityPolicy-FS-2018-06     ELBSecurityPolicy-FS-1-1-2019-08     ELBSecurityPolicy-FS-1-2-2019-08     ELBSecurityPolicy-FS-1-2-Res-2019-08    For more information, see Security Policies in the Application Load Balancers Guide and Security Policies in the Network Load Balancers Guide.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.native
}

object CreateListenerInput {
  @scala.inline
  def apply(
    DefaultActions: Actions,
    LoadBalancerArn: LoadBalancerArn,
    Port: Port,
    Protocol: ProtocolEnum,
    AlpnPolicy: AlpnPolicyName = null,
    Certificates: CertificateList = null,
    SslPolicy: SslPolicyName = null
  ): CreateListenerInput = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    if (AlpnPolicy != null) __obj.updateDynamic("AlpnPolicy")(AlpnPolicy.asInstanceOf[js.Any])
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (SslPolicy != null) __obj.updateDynamic("SslPolicy")(SslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerInput]
  }
}

