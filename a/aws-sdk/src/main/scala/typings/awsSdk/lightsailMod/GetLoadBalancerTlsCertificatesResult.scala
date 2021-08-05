package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerTlsCertificatesResult extends StObject {
  
  /**
    * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
    */
  var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.undefined
}
object GetLoadBalancerTlsCertificatesResult {
  
  inline def apply(): GetLoadBalancerTlsCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesResult]
  }
  
  extension [Self <: GetLoadBalancerTlsCertificatesResult](x: Self) {
    
    inline def setTlsCertificates(value: LoadBalancerTlsCertificateList): Self = StObject.set(x, "tlsCertificates", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificatesUndefined: Self = StObject.set(x, "tlsCertificates", js.undefined)
    
    inline def setTlsCertificatesVarargs(value: LoadBalancerTlsCertificate*): Self = StObject.set(x, "tlsCertificates", js.Array(value :_*))
  }
}
