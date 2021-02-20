package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCertificateRequest extends StObject {
  
  /**
    * The name of the certificate to delete. Use the GetCertificates action to get a list of certificate names that you can specify.
    */
  var certificateName: CertificateName = js.native
}
object DeleteCertificateRequest {
  
  @scala.inline
  def apply(certificateName: CertificateName): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  
  @scala.inline
  implicit class DeleteCertificateRequestMutableBuilder[Self <: DeleteCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateName(value: CertificateName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
  }
}
