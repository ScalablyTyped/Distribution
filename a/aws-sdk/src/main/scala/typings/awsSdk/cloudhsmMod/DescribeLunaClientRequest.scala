package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLunaClientRequest extends js.Object {
  
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
  implicit class DescribeLunaClientRequestOps[Self <: DescribeLunaClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateFingerprint(value: CertificateFingerprint): Self = this.set("CertificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateFingerprint: Self = this.set("CertificateFingerprint", js.undefined)
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = this.set("ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientArn: Self = this.set("ClientArn", js.undefined)
  }
}
