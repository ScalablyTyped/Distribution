package typings.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.UnmarshalledRawEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.UnmarshalledSimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEmailMessage extends EmailMessage {
  /**
    * An email represented as a raw MIME message.
    */
  @JSName("RawEmail")
  var RawEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledRawEmail] = js.undefined
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  @JSName("ReplyToAddresses")
  var ReplyToAddresses_UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An email composed of a subject, a text part and a html part.
    */
  @JSName("SimpleEmail")
  var SimpleEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledSimpleEmail] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object UnmarshalledEmailMessage {
  @scala.inline
  def apply(
    Body: String = null,
    FeedbackForwardingAddress: String = null,
    FromAddress: String = null,
    RawEmail: UnmarshalledRawEmail = null,
    ReplyToAddresses: js.Array[String] = null,
    SimpleEmail: UnmarshalledSimpleEmail = null,
    Substitutions: StringDictionary[js.Array[String]] = null
  ): UnmarshalledEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (FeedbackForwardingAddress != null) __obj.updateDynamic("FeedbackForwardingAddress")(FeedbackForwardingAddress.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (RawEmail != null) __obj.updateDynamic("RawEmail")(RawEmail.asInstanceOf[js.Any])
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses.asInstanceOf[js.Any])
    if (SimpleEmail != null) __obj.updateDynamic("SimpleEmail")(SimpleEmail.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEmailMessage]
  }
}

