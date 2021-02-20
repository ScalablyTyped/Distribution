package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoadBalancerRequest extends StObject {
  
  /**
    * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.native
  
  /**
    * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
    */
  var certificateDomainName: js.UndefOr[DomainName] = js.native
  
  /**
    * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
    */
  var certificateName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
    */
  var healthCheckPath: js.UndefOr[String] = js.native
  
  /**
    * The instance port where you're creating your load balancer.
    */
  var instancePort: Port = js.native
  
  /**
    * The name of your load balancer.
    */
  var loadBalancerName: ResourceName = js.native
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateLoadBalancerRequest {
  
  @scala.inline
  def apply(instancePort: Port, loadBalancerName: ResourceName): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
  
  @scala.inline
  implicit class CreateLoadBalancerRequestMutableBuilder[Self <: CreateLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAlternativeNames(value: DomainNameList): Self = StObject.set(x, "certificateAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAlternativeNamesUndefined: Self = StObject.set(x, "certificateAlternativeNames", js.undefined)
    
    @scala.inline
    def setCertificateAlternativeNamesVarargs(value: DomainName*): Self = StObject.set(x, "certificateAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setCertificateDomainName(value: DomainName): Self = StObject.set(x, "certificateDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateDomainNameUndefined: Self = StObject.set(x, "certificateDomainName", js.undefined)
    
    @scala.inline
    def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: String): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
    
    @scala.inline
    def setInstancePort(value: Port): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
