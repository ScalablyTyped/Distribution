package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCACertificateRequest extends StObject {
  
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId
}
object DescribeCACertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId): DescribeCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCACertificateRequest]
  }
  
  @scala.inline
  implicit class DescribeCACertificateRequestMutableBuilder[Self <: DescribeCACertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
  }
}
