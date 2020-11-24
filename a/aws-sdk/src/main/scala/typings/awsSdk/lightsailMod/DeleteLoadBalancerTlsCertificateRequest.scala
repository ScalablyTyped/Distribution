package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLoadBalancerTlsCertificateRequest extends js.Object {
  
  /**
    * The SSL/TLS certificate name.
    */
  var certificateName: ResourceName = js.native
  
  /**
    * When true, forces the deletion of an SSL/TLS certificate. There can be two certificates associated with a Lightsail load balancer: the primary and the backup. The force parameter is required when the primary SSL/TLS certificate is in use by an instance attached to the load balancer.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * The load balancer name.
    */
  var loadBalancerName: ResourceName = js.native
}
object DeleteLoadBalancerTlsCertificateRequest {
  
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): DeleteLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoadBalancerTlsCertificateRequest]
  }
  
  @scala.inline
  implicit class DeleteLoadBalancerTlsCertificateRequestOps[Self <: DeleteLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
}
