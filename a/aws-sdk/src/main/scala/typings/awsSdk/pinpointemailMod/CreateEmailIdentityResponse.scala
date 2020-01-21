package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
    */
  var DkimAttributes: js.UndefOr[typings.awsSdk.pinpointemailMod.DkimAttributes] = js.native
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.pinpointemailMod.IdentityType] = js.native
  /**
    * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
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

