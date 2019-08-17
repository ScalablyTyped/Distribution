package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailPartMod._SimpleEmailPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SimpleEmail extends js.Object {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  var HtmlPart: js.UndefOr[_SimpleEmailPart] = js.undefined
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  var Subject: js.UndefOr[_SimpleEmailPart] = js.undefined
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  var TextPart: js.UndefOr[_SimpleEmailPart] = js.undefined
}

object _SimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: _SimpleEmailPart = null,
    Subject: _SimpleEmailPart = null,
    TextPart: _SimpleEmailPart = null
  ): _SimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    __obj.asInstanceOf[_SimpleEmail]
  }
}

