package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCertificateRequest extends StObject {
  
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.native
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  
  /**
    * A boolean value that specifies if the certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.native
  
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}
object RegisterCertificateRequest {
  
  @scala.inline
  def apply(certificatePem: CertificatePem): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  
  @scala.inline
  implicit class RegisterCertificateRequestMutableBuilder[Self <: RegisterCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaCertificatePem(value: CertificatePem): Self = StObject.set(x, "caCertificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificatePemUndefined: Self = StObject.set(x, "caCertificatePem", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActive(value: SetAsActiveFlag): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
