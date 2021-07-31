package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeysAndCertificateResponse extends StObject {
  
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * The generated key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
}
object CreateKeysAndCertificateResponse {
  
  @scala.inline
  def apply(): CreateKeysAndCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateResponse]
  }
  
  @scala.inline
  implicit class CreateKeysAndCertificateResponseMutableBuilder[Self <: CreateKeysAndCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    @scala.inline
    def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
