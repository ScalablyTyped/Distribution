package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLunaClientRequest extends StObject {
  
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
}
object DescribeLunaClientRequest {
  
  @scala.inline
  def apply(): DescribeLunaClientRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientRequest]
  }
  
  @scala.inline
  implicit class DescribeLunaClientRequestMutableBuilder[Self <: DescribeLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "CertificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateFingerprintUndefined: Self = StObject.set(x, "CertificateFingerprint", js.undefined)
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}
