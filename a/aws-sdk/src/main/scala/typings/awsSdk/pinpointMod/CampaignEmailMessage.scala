package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignEmailMessage extends js.Object {
  /**
    * The body of the email for recipients whose email clients don't render HTML content.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The verified email address to send the email from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.native
  /**
    * The body of the email, in HTML format, for recipients whose email clients render HTML content.
    */
  var HtmlBody: js.UndefOr[string] = js.native
  /**
    * The subject line, or title, of the email.
    */
  var Title: string = js.native
}

object CampaignEmailMessage {
  @scala.inline
  def apply(Title: string, Body: string = null, FromAddress: string = null, HtmlBody: string = null): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignEmailMessage]
  }
}

