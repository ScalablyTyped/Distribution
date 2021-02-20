package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificateDomainValidationOption extends StObject {
  
  /**
    * The fully qualified domain name in the certificate request.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * The status of the domain validation. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
}
object LoadBalancerTlsCertificateDomainValidationOption {
  
  @scala.inline
  def apply(): LoadBalancerTlsCertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationOption]
  }
  
  @scala.inline
  implicit class LoadBalancerTlsCertificateDomainValidationOptionMutableBuilder[Self <: LoadBalancerTlsCertificateDomainValidationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: LoadBalancerTlsCertificateDomainStatus): Self = StObject.set(x, "validationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusUndefined: Self = StObject.set(x, "validationStatus", js.undefined)
  }
}
