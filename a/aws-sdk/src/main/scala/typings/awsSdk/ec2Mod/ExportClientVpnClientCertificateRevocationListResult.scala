package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportClientVpnClientCertificateRevocationListResult extends js.Object {
  /**
    * Information about the client certificate revocation list.
    */
  var CertificateRevocationList: js.UndefOr[String] = js.native
  /**
    * The current state of the client certificate revocation list.
    */
  var Status: js.UndefOr[ClientCertificateRevocationListStatus] = js.native
}

object ExportClientVpnClientCertificateRevocationListResult {
  @scala.inline
  def apply(): ExportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListResult]
  }
  @scala.inline
  implicit class ExportClientVpnClientCertificateRevocationListResultOps[Self <: ExportClientVpnClientCertificateRevocationListResult] (val x: Self) extends AnyVal {
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
    def setCertificateRevocationList(value: String): Self = this.set("CertificateRevocationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateRevocationList: Self = this.set("CertificateRevocationList", js.undefined)
    @scala.inline
    def setStatus(value: ClientCertificateRevocationListStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

