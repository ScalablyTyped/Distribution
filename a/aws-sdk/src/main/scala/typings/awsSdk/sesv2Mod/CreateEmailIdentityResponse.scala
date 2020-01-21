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
  def apply(
    DkimAttributes: DkimAttributes = null,
    IdentityType: IdentityType = null,
    VerifiedForSendingStatus: js.UndefOr[Boolean] = js.undefined
  ): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (DkimAttributes != null) __obj.updateDynamic("DkimAttributes")(DkimAttributes.asInstanceOf[js.Any])
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(VerifiedForSendingStatus)) __obj.updateDynamic("VerifiedForSendingStatus")(VerifiedForSendingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
}

