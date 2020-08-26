package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutgoingCertificatesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The certificates that are being transferred but not yet accepted.
    */
  var outgoingCertificates: js.UndefOr[OutgoingCertificates] = js.native
}

object ListOutgoingCertificatesResponse {
  @scala.inline
  def apply(): ListOutgoingCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingCertificatesResponse]
  }
  @scala.inline
  implicit class ListOutgoingCertificatesResponseOps[Self <: ListOutgoingCertificatesResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
    @scala.inline
    def setOutgoingCertificatesVarargs(value: OutgoingCertificate*): Self = this.set("outgoingCertificates", js.Array(value :_*))
    @scala.inline
    def setOutgoingCertificates(value: OutgoingCertificates): Self = this.set("outgoingCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutgoingCertificates: Self = this.set("outgoingCertificates", js.undefined)
  }
  
}

