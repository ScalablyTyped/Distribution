package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerCertificate extends js.Object {
  
  /**
    * The contents of the public key certificate.
    */
  var CertificateBody: certificateBodyType = js.native
  
  /**
    * The contents of the public key certificate chain.
    */
  var CertificateChain: js.UndefOr[certificateChainType] = js.native
  
  /**
    * The meta information of the server certificate, such as its name, path, ID, and ARN.
    */
  var ServerCertificateMetadata: typings.awsSdk.iamMod.ServerCertificateMetadata = js.native
}
object ServerCertificate {
  
  @scala.inline
  def apply(CertificateBody: certificateBodyType, ServerCertificateMetadata: ServerCertificateMetadata): ServerCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], ServerCertificateMetadata = ServerCertificateMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificate]
  }
  
  @scala.inline
  implicit class ServerCertificateOps[Self <: ServerCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateBody(value: certificateBodyType): Self = this.set("CertificateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateMetadata(value: ServerCertificateMetadata): Self = this.set("ServerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChain(value: certificateChainType): Self = this.set("CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateChain: Self = this.set("CertificateChain", js.undefined)
  }
}
