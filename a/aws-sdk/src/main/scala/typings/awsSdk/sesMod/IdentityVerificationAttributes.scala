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
  def apply(VerificationStatus: VerificationStatus): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
  @scala.inline
  implicit class IdentityVerificationAttributesOps[Self <: IdentityVerificationAttributes] (val x: Self) extends AnyVal {
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
    def setVerificationStatus(value: VerificationStatus): Self = this.set("VerificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationToken(value: VerificationToken): Self = this.set("VerificationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationToken: Self = this.set("VerificationToken", js.undefined)
  }
  
}

