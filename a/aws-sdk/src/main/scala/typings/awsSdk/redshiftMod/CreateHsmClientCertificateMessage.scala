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
  def apply(HsmClientCertificateIdentifier: String, Tags: TagList = null): CreateHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmClientCertificateMessage]
  }
}

