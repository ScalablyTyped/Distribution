package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCACertificateResponse extends StObject {
  
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The CA certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}
object RegisterCACertificateResponse {
  
  @scala.inline
  def apply(): RegisterCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCACertificateResponse]
  }
  
  @scala.inline
  implicit class RegisterCACertificateResponseMutableBuilder[Self <: RegisterCACertificateResponse] (val x: Self) extends AnyVal {
    
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
