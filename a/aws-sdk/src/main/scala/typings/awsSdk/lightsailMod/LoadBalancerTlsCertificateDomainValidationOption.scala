package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerTlsCertificateDomainValidationOption extends StObject {
  
  /**
    * The fully qualified domain name in the certificate request.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The status of the domain validation. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
}
object LoadBalancerTlsCertificateDomainValidationOption {
  
  inline def apply(): LoadBalancerTlsCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
  }
  
  extension [Self <: LoadBalancerTlsCertificateDomainValidationOption](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    inline def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
  }
}
