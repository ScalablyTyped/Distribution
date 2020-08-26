package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmClientCertificateMessage extends js.Object {
  /**
    * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM to use the database encryption keys.
    */
  var HsmClientCertificateIdentifier: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateHsmClientCertificateMessage {
  @scala.inline
  def apply(HsmClientCertificateIdentifier: String): CreateHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmClientCertificateMessage]
  }
  @scala.inline
  implicit class CreateHsmClientCertificateMessageOps[Self <: CreateHsmClientCertificateMessage] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

