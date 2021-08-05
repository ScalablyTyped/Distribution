package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateResponse extends StObject {
  
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}
object RegisterCertificateResponse {
  
  inline def apply(): RegisterCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateResponse]
  }
  
  extension [Self <: RegisterCertificateResponse](x: Self) {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
  }
}
