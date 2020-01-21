package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityVerificationAttributes extends js.Object {
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: typings.awsSdk.sesMod.VerificationStatus = js.native
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[typings.awsSdk.sesMod.VerificationToken] = js.native
}

object IdentityVerificationAttributes {
  @scala.inline
  def apply(VerificationStatus: VerificationStatus, VerificationToken: VerificationToken = null): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    if (VerificationToken != null) __obj.updateDynamic("VerificationToken")(VerificationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
}

