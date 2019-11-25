package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRawEmailMod._UnmarshalledRawEmail
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailMod._UnmarshalledSimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEmailMessage extends _EmailMessage {
  /**
    * An email represented as a raw MIME message.
    */
  @JSName("RawEmail")
  var RawEmail__UnmarshalledEmailMessage: js.UndefOr[_UnmarshalledRawEmail] = js.undefined
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  @JSName("ReplyToAddresses")
  var ReplyToAddresses__UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An email composed of a subject, a text part and a html part.
    */
  @JSName("SimpleEmail")
  var SimpleEmail__UnmarshalledEmailMessage: js.UndefOr[_UnmarshalledSimpleEmail] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledEmailMessage {
  @scala.inline
  def apply(
    Body: String = null,
    FeedbackForwardingAddress: String = null,
    FromAddress: String = null,
    RawEmail: _UnmarshalledRawEmail = null,
    ReplyToAddresses: js.Array[String] = null,
    SimpleEmail: _UnmarshalledSimpleEmail = null,
    Substitutions: StringDictionary[js.Array[String]] = null
  ): _UnmarshalledEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (FeedbackForwardingAddress != null) __obj.updateDynamic("FeedbackForwardingAddress")(FeedbackForwardingAddress.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (RawEmail != null) __obj.updateDynamic("RawEmail")(RawEmail.asInstanceOf[js.Any])
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses.asInstanceOf[js.Any])
    if (SimpleEmail != null) __obj.updateDynamic("SimpleEmail")(SimpleEmail.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEmailMessage]
  }
}

