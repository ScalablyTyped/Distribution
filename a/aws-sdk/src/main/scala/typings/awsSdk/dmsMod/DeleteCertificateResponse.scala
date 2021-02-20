package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCertificateResponse extends StObject {
  
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[typings.awsSdk.dmsMod.Certificate] = js.native
}
object DeleteCertificateResponse {
  
  @scala.inline
  def apply(): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
  
  @scala.inline
  implicit class DeleteCertificateResponseMutableBuilder[Self <: DeleteCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
