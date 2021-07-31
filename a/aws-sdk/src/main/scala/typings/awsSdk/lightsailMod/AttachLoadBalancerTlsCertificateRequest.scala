package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerTlsCertificateRequest extends StObject {
  
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName
  
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName
}
object AttachLoadBalancerTlsCertificateRequest {
  
  @scala.inline
  def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
  
  @scala.inline
  implicit class AttachLoadBalancerTlsCertificateRequestMutableBuilder[Self <: AttachLoadBalancerTlsCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
