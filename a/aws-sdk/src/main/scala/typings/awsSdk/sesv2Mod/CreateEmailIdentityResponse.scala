package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.DkimAttributes] = js.native
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.sesv2Mod.IdentityType] = js.native
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}

object CreateEmailIdentityResponse {
  @scala.inline
  def apply(): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
  @scala.inline
  implicit class CreateEmailIdentityResponseOps[Self <: CreateEmailIdentityResponse] (val x: Self) extends AnyVal {
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
    def setDkimAttributes(value: DkimAttributes): Self = this.set("DkimAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkimAttributes: Self = this.set("DkimAttributes", js.undefined)
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityType: Self = this.set("IdentityType", js.undefined)
    @scala.inline
    def setVerifiedForSendingStatus(value: Enabled): Self = this.set("VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifiedForSendingStatus: Self = this.set("VerifiedForSendingStatus", js.undefined)
  }
  
}

