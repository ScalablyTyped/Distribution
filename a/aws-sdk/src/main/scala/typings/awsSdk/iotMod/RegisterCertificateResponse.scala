package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCertificateResponse extends StObject {
  
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  
  /**
    * The certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
}
object RegisterCertificateResponse {
  
  @scala.inline
  def apply(): RegisterCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateResponse]
  }
  
  @scala.inline
  implicit class RegisterCertificateResponseMutableBuilder[Self <: RegisterCertificateResponse] (val x: Self) extends AnyVal {
    
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
