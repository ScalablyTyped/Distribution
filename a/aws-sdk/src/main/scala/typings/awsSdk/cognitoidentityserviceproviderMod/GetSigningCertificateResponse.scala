package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSigningCertificateResponse extends StObject {
  
  /**
    * The signing certificate.
    */
  var Certificate: js.UndefOr[StringType] = js.native
}
object GetSigningCertificateResponse {
  
  @scala.inline
  def apply(): GetSigningCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningCertificateResponse]
  }
  
  @scala.inline
  implicit class GetSigningCertificateResponseMutableBuilder[Self <: GetSigningCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: StringType): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
