package typings.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailMessage extends js.Object {
  
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[String] = js.native
  
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.native
  
  /**
    * An email represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail] = js.native
  
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * An email composed of a subject, a text part and a html part.
    */
  var SimpleEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail] = js.native
  
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
}
object EmailMessage {
  
  @scala.inline
  def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessage]
  }
  
  @scala.inline
  implicit class EmailMessageOps[Self <: EmailMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setFeedbackForwardingAddress(value: String): Self = this.set("FeedbackForwardingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackForwardingAddress: Self = this.set("FeedbackForwardingAddress", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setRawEmail(value: RawEmail): Self = this.set("RawEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawEmail: Self = this.set("RawEmail", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: String*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setReplyToAddresses(value: js.Array[String] | Iterable[String]): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setSimpleEmail(value: SimpleEmail): Self = this.set("SimpleEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleEmail: Self = this.set("SimpleEmail", js.undefined)
    
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
}
