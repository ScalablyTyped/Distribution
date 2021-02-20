package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCertificateResult extends StObject {
  
  /**
    * Information about the certificate, including registered date time, certificate state, the reason for the state, expiration date time, and certificate common name.
    */
  var Certificate: js.UndefOr[typings.awsSdk.directoryserviceMod.Certificate] = js.native
}
object DescribeCertificateResult {
  
  @scala.inline
  def apply(): DescribeCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResult]
  }
  
  @scala.inline
  implicit class DescribeCertificateResultMutableBuilder[Self <: DescribeCertificateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
