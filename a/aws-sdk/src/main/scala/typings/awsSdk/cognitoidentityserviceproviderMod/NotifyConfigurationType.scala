package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyConfigurationType extends js.Object {
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.native
  /**
    * The MFA email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType = js.native
}

object NotifyConfigurationType {
  @scala.inline
  def apply(
    SourceArn: ArnType,
    BlockEmail: NotifyEmailType = null,
    From: StringType = null,
    MfaEmail: NotifyEmailType = null,
    NoActionEmail: NotifyEmailType = null,
    ReplyTo: StringType = null
  ): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    if (BlockEmail != null) __obj.updateDynamic("BlockEmail")(BlockEmail.asInstanceOf[js.Any])
    if (From != null) __obj.updateDynamic("From")(From.asInstanceOf[js.Any])
    if (MfaEmail != null) __obj.updateDynamic("MfaEmail")(MfaEmail.asInstanceOf[js.Any])
    if (NoActionEmail != null) __obj.updateDynamic("NoActionEmail")(NoActionEmail.asInstanceOf[js.Any])
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyConfigurationType]
  }
}

