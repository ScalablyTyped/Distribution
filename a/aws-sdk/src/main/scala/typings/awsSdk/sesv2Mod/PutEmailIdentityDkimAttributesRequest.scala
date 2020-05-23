package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityDkimAttributesRequest extends js.Object {
  /**
    * The email identity that you want to change the DKIM settings for.
    */
  var EmailIdentity: Identity = js.native
  /**
    * Sets the DKIM signing configuration for the identity. When you set this value true, then the messages that are sent from the identity are signed using DKIM. If you set this value to false, your messages are sent without DKIM signing.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
}

object PutEmailIdentityDkimAttributesRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, SigningEnabled: js.UndefOr[Enabled] = js.undefined): PutEmailIdentityDkimAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(SigningEnabled)) __obj.updateDynamic("SigningEnabled")(SigningEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityDkimAttributesRequest]
  }
}

