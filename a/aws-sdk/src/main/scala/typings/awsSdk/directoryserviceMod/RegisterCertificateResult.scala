package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCertificateResult extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificateId] = js.native
}
object RegisterCertificateResult {
  
  @scala.inline
  def apply(): RegisterCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateResult]
  }
  
  @scala.inline
  implicit class RegisterCertificateResultMutableBuilder[Self <: RegisterCertificateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
  }
}
