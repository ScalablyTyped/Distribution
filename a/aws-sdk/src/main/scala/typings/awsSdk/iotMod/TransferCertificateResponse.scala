package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferCertificateResponse extends StObject {
  
  /**
    * The ARN of the certificate.
    */
  var transferredCertificateArn: js.UndefOr[CertificateArn] = js.native
}
object TransferCertificateResponse {
  
  @scala.inline
  def apply(): TransferCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCertificateResponse]
  }
  
  @scala.inline
  implicit class TransferCertificateResponseMutableBuilder[Self <: TransferCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransferredCertificateArn(value: CertificateArn): Self = StObject.set(x, "transferredCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferredCertificateArnUndefined: Self = StObject.set(x, "transferredCertificateArn", js.undefined)
  }
}
