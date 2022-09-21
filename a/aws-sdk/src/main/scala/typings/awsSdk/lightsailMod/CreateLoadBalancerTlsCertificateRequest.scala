package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoadBalancerTlsCertificateRequest extends StObject {
  
  /**
    * An array of strings listing alternative domains and subdomains for your SSL/TLS certificate. Lightsail will de-dupe the names for you. You can have a maximum of 9 alternative names (in addition to the 1 primary domain). We do not support wildcards (e.g., *.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.undefined
  
  /**
    * The domain name (e.g., example.com) for your SSL/TLS certificate.
    */
  var certificateDomainName: DomainName
  
  /**
    * The SSL/TLS certificate name. You can have up to 10 certificates in your account at one time. Each Lightsail load balancer can have up to 2 certificates associated with it at one time. There is also an overall limit to the number of certificates that can be issue in a 365-day period. For more information, see Limits.
    */
  var certificateName: ResourceName
  
  /**
    * The load balancer name where you want to create the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateLoadBalancerTlsCertificateRequest {
  
  inline def apply(certificateDomainName: DomainName, certificateName: ResourceName, loadBalancerName: ResourceName): CreateLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateDomainName = certificateDomainName.asInstanceOf[js.Any], certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerTlsCertificateRequest]
  }
  
  extension [Self <: CreateLoadBalancerTlsCertificateRequest](x: Self) {
    
    inline def setCertificateAlternativeNames(value: DomainNameList): Self = StObject.set(x, "certificateAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setCertificateAlternativeNamesUndefined: Self = StObject.set(x, "certificateAlternativeNames", js.undefined)
    
    inline def setCertificateAlternativeNamesVarargs(value: DomainName*): Self = StObject.set(x, "certificateAlternativeNames", js.Array(value*))
    
    inline def setCertificateDomainName(value: DomainName): Self = StObject.set(x, "certificateDomainName", value.asInstanceOf[js.Any])
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
