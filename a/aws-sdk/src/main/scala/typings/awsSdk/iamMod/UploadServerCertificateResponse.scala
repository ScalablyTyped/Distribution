package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadServerCertificateResponse extends js.Object {
  
  /**
    * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
    */
  var ServerCertificateMetadata: js.UndefOr[typings.awsSdk.iamMod.ServerCertificateMetadata] = js.native
}
object UploadServerCertificateResponse {
  
  @scala.inline
  def apply(): UploadServerCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServerCertificateResponse]
  }
  
  @scala.inline
  implicit class UploadServerCertificateResponseOps[Self <: UploadServerCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setServerCertificateMetadata(value: ServerCertificateMetadata): Self = this.set("ServerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateMetadata: Self = this.set("ServerCertificateMetadata", js.undefined)
  }
}
