package typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignEmailMessage extends js.Object {
  /**
    * The email text body.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.undefined
  /**
    * The email html body.
    */
  var HtmlBody: js.UndefOr[String] = js.undefined
  /**
    * The email title (Or subject).
    */
  var Title: js.UndefOr[String] = js.undefined
}

object CampaignEmailMessage {
  @scala.inline
  def apply(Body: String = null, FromAddress: String = null, HtmlBody: String = null, Title: String = null): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignEmailMessage]
  }
}

