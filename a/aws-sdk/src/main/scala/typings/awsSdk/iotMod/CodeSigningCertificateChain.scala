package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeSigningCertificateChain extends js.Object {
  
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.native
}
object CodeSigningCertificateChain {
  
  @scala.inline
  def apply(): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
  
  @scala.inline
  implicit class CodeSigningCertificateChainOps[Self <: CodeSigningCertificateChain] (val x: Self) extends AnyVal {
    
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
    def setCertificateName(value: CertificateName): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    
    @scala.inline
    def setInlineDocument(value: InlineDocument): Self = this.set("inlineDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineDocument: Self = this.set("inlineDocument", js.undefined)
  }
}
