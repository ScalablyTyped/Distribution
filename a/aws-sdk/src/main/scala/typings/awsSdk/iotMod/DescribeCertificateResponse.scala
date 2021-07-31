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
  
  @scala.inline
  def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  @scala.inline
  implicit class DescribeCertificateResponseMutableBuilder[Self <: DescribeCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateDescription(value: CertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
  }
}
