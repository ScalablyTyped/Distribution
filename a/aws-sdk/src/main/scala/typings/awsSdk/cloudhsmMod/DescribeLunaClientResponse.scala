package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLunaClientResponse extends js.Object {
  
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[typings.awsSdk.cloudhsmMod.Certificate] = js.native
  
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
  
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[typings.awsSdk.cloudhsmMod.Label] = js.native
  
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
}
object DescribeLunaClientResponse {
  
  @scala.inline
  def apply(): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
  
  @scala.inline
  implicit class DescribeLunaClientResponseOps[Self <: DescribeLunaClientResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    
    @scala.inline
    def setCertificateFingerprint(value: CertificateFingerprint): Self = this.set("CertificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateFingerprint: Self = this.set("CertificateFingerprint", js.undefined)
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = this.set("ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientArn: Self = this.set("ClientArn", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: Timestamp): Self = this.set("LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("LastModifiedTimestamp", js.undefined)
  }
}
