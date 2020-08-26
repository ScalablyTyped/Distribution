package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateResponse extends js.Object {
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[typings.awsSdk.dmsMod.Certificate] = js.native
}

object ImportCertificateResponse {
  @scala.inline
  def apply(): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  @scala.inline
  implicit class ImportCertificateResponseOps[Self <: ImportCertificateResponse] (val x: Self) extends AnyVal {
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
  }
  
}

