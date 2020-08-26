package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTlsCertificateRequest extends js.Object {
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName = js.native
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName = js.native
}

object AttachLoadBalancerTlsCertificateRequest {
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
  @scala.inline
  implicit class AttachLoadBalancerTlsCertificateRequestOps[Self <: AttachLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
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
    def setCertificateName(value: ResourceName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = this.set("loadBalancerName", value.asInstanceOf[js.Any])
  }
  
}

