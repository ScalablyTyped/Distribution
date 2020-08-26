package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResult extends js.Object {
  /**
    * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
    */
  var CertificatesInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificatesInfo] = js.native
  /**
    * Indicates whether another page of certificates is available when the number of available certificates exceeds the page limit.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListCertificatesResult {
  @scala.inline
  def apply(): ListCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResult]
  }
  @scala.inline
  implicit class ListCertificatesResultOps[Self <: ListCertificatesResult] (val x: Self) extends AnyVal {
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
    def setCertificatesInfoVarargs(value: CertificateInfo*): Self = this.set("CertificatesInfo", js.Array(value :_*))
    @scala.inline
    def setCertificatesInfo(value: CertificatesInfo): Self = this.set("CertificatesInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatesInfo: Self = this.set("CertificatesInfo", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

