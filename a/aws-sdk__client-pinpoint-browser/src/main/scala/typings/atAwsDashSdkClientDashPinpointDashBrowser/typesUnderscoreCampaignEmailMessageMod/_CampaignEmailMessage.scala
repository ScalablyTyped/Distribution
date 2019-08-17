package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignEmailMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignEmailMessage extends js.Object {
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

object _CampaignEmailMessage {
  @scala.inline
  def apply(Body: String = null, FromAddress: String = null, HtmlBody: String = null, Title: String = null): _CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[_CampaignEmailMessage]
  }
}

