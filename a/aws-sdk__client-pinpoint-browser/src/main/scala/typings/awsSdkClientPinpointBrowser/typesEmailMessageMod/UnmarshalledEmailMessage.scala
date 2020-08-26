package typings.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.UnmarshalledRawEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.UnmarshalledSimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEmailMessage extends EmailMessage {
  /**
    * An email represented as a raw MIME message.
    */
  @JSName("RawEmail")
  var RawEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledRawEmail] = js.native
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  @JSName("ReplyToAddresses")
  var ReplyToAddresses_UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.native
  /**
    * An email composed of a subject, a text part and a html part.
    */
  @JSName("SimpleEmail")
  var SimpleEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledSimpleEmail] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledEmailMessage {
  @scala.inline
  def apply(): UnmarshalledEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEmailMessage]
  }
  @scala.inline
  implicit class UnmarshalledEmailMessageOps[Self <: UnmarshalledEmailMessage] (val x: Self) extends AnyVal {
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
    def setRawEmail(value: UnmarshalledRawEmail): Self = this.set("RawEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawEmail: Self = this.set("RawEmail", js.undefined)
    @scala.inline
    def setReplyToAddressesVarargs(value: String*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    @scala.inline
    def setReplyToAddresses(value: js.Array[String]): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
    @scala.inline
    def setSimpleEmail(value: UnmarshalledSimpleEmail): Self = this.set("SimpleEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleEmail: Self = this.set("SimpleEmail", js.undefined)
    @scala.inline
    def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
  
}

