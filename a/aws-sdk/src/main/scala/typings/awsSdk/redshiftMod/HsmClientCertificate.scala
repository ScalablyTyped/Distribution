package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmClientCertificate extends js.Object {
  /**
    * The identifier of the HSM client certificate.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
    */
  var HsmClientCertificatePublicKey: js.UndefOr[String] = js.native
  /**
    * The list of tags for the HSM client certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object HsmClientCertificate {
  @scala.inline
  def apply(): HsmClientCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmClientCertificate]
  }
  @scala.inline
  implicit class HsmClientCertificateOps[Self <: HsmClientCertificate] (val x: Self) extends AnyVal {
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
    def setHsmClientCertificateIdentifier(value: String): Self = this.set("HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmClientCertificateIdentifier: Self = this.set("HsmClientCertificateIdentifier", js.undefined)
    @scala.inline
    def setHsmClientCertificatePublicKey(value: String): Self = this.set("HsmClientCertificatePublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmClientCertificatePublicKey: Self = this.set("HsmClientCertificatePublicKey", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

