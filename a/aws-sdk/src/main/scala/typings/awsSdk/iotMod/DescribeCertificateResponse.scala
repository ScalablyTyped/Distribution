package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateResponse extends StObject {
  
  /**
    * The description of the certificate.
    */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
}
object DescribeCertificateResponse {
  
  inline def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  extension [Self <: DescribeCertificateResponse](x: Self) {
    
    inline def setCertificateDescription(value: CertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    inline def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
  }
}
