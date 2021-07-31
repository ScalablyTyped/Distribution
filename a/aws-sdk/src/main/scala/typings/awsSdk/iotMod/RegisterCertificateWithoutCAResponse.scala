package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateWithoutCAResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the registered certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the registered certificate. (The last part of the certificate ARN contains the certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}
object RegisterCertificateWithoutCAResponse {
  
  @scala.inline
  def apply(): RegisterCertificateWithoutCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateWithoutCAResponse]
  }
  
  @scala.inline
  implicit class RegisterCertificateWithoutCAResponseMutableBuilder[Self <: RegisterCertificateWithoutCAResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
  }
}
