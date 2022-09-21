package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateConfiguration extends StObject {
  
  /**
    * Indicates whether a TLS/SSL certificate is generated for a fleet.  Valid values include:     GENERATED - Generate a TLS/SSL certificate for this fleet.    DISABLED - (default) Do not generate a TLS/SSL certificate for this fleet.   
    */
  var CertificateType: typings.awsSdk.gameliftMod.CertificateType
}
object CertificateConfiguration {
  
  inline def apply(CertificateType: CertificateType): CertificateConfiguration = {
    val __obj = js.Dynamic.literal(CertificateType = CertificateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateConfiguration]
  }
  
  extension [Self <: CertificateConfiguration](x: Self) {
    
    inline def setCertificateType(value: CertificateType): Self = StObject.set(x, "CertificateType", value.asInstanceOf[js.Any])
  }
}
