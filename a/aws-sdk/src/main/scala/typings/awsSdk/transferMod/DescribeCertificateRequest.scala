package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateRequest extends StObject {
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateId: typings.awsSdk.transferMod.CertificateId
}
object DescribeCertificateRequest {
  
  inline def apply(CertificateId: CertificateId): DescribeCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateRequest]
  }
  
  extension [Self <: DescribeCertificateRequest](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
  }
}
