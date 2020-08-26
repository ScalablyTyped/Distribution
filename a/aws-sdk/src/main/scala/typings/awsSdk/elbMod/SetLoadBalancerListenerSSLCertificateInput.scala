package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The port that uses the specified SSL certificate.
    */
  var LoadBalancerPort: AccessPointPort = js.native
  /**
    * The Amazon Resource Name (ARN) of the SSL certificate.
    */
  var SSLCertificateId: typings.awsSdk.elbMod.SSLCertificateId = js.native
}

object SetLoadBalancerListenerSSLCertificateInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    LoadBalancerPort: AccessPointPort,
    SSLCertificateId: SSLCertificateId
  ): SetLoadBalancerListenerSSLCertificateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], SSLCertificateId = SSLCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
  }
  @scala.inline
  implicit class SetLoadBalancerListenerSSLCertificateInputOps[Self <: SetLoadBalancerListenerSSLCertificateInput] (val x: Self) extends AnyVal {
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
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerPort(value: AccessPointPort): Self = this.set("LoadBalancerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setSSLCertificateId(value: SSLCertificateId): Self = this.set("SSLCertificateId", value.asInstanceOf[js.Any])
  }
  
}

