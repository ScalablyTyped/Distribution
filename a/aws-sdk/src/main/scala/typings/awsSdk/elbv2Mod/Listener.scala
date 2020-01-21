package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
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
    * [HTTPS or TLS listener] The security policy that defines which ciphers and protocols are supported. The default is the current predefined security policy.
    */
  var SslPolicy: js.UndefOr[SslPolicyName] = js.native
}

object Listener {
  @scala.inline
  def apply(
    Certificates: CertificateList = null,
    DefaultActions: Actions = null,
    ListenerArn: ListenerArn = null,
    LoadBalancerArn: LoadBalancerArn = null,
    Port: Int | Double = null,
    Protocol: ProtocolEnum = null,
    SslPolicy: SslPolicyName = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (DefaultActions != null) __obj.updateDynamic("DefaultActions")(DefaultActions.asInstanceOf[js.Any])
    if (ListenerArn != null) __obj.updateDynamic("ListenerArn")(ListenerArn.asInstanceOf[js.Any])
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SslPolicy != null) __obj.updateDynamic("SslPolicy")(SslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}

