package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCertificateWithoutCARequest extends StObject {
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}
object RegisterCertificateWithoutCARequest {
  
  @scala.inline
  def apply(certificatePem: CertificatePem): RegisterCertificateWithoutCARequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateWithoutCARequest]
  }
  
  @scala.inline
  implicit class RegisterCertificateWithoutCARequestMutableBuilder[Self <: RegisterCertificateWithoutCARequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
