package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityFeedbackAttributesRequest extends js.Object {
  /**
    * Sets the feedback forwarding configuration for the identity. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  var EmailForwardingEnabled: js.UndefOr[Enabled] = js.native
  /**
    * The email identity that you want to configure bounce and complaint feedback forwarding for.
    */
  var EmailIdentity: Identity = js.native
}

object PutEmailIdentityFeedbackAttributesRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, EmailForwardingEnabled: js.UndefOr[Boolean] = js.undefined): PutEmailIdentityFeedbackAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(EmailForwardingEnabled)) __obj.updateDynamic("EmailForwardingEnabled")(EmailForwardingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityFeedbackAttributesRequest]
  }
}

