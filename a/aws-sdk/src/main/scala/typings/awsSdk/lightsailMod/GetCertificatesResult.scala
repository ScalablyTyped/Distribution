package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificatesResult extends js.Object {
  /**
    * An object that describes certificates.
    */
  var certificates: js.UndefOr[CertificateSummaryList] = js.native
}

object GetCertificatesResult {
  @scala.inline
  def apply(): GetCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificatesResult]
  }
  @scala.inline
  implicit class GetCertificatesResultOps[Self <: GetCertificatesResult] (val x: Self) extends AnyVal {
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
    def setCertificatesVarargs(value: CertificateSummary*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: CertificateSummaryList): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
  }
  
}

