package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * The root certificate of the certificate authority.
    */
  var Certificate: js.UndefOr[typings.awsSdk.worklinkMod.Certificate] = js.native
  /**
    * The time that the certificate authority was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
}

object DescribeWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(): DescribeWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class DescribeWebsiteCertificateAuthorityResponseOps[Self <: DescribeWebsiteCertificateAuthorityResponse] (val x: Self) extends AnyVal {
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
    def setCertificate(value: Certificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    @scala.inline
    def setCreatedTime(value: DateTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
  }
  
}

