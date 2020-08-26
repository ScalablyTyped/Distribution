package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenerCertificatesOutput extends js.Object {
  /**
    * Information about the certificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeListenerCertificatesOutput {
  @scala.inline
  def apply(): DescribeListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenerCertificatesOutput]
  }
  @scala.inline
  implicit class DescribeListenerCertificatesOutputOps[Self <: DescribeListenerCertificatesOutput] (val x: Self) extends AnyVal {
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
    def setCertificatesVarargs(value: Certificate*): Self = this.set("Certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: CertificateList): Self = this.set("Certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("Certificates", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

