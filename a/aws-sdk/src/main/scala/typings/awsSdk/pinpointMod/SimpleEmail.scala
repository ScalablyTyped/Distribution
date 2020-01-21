package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmail extends js.Object {
  /**
    * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The subject line, or title, of the email.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The body of the email message, in plain text format. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.native
}

object SimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: SimpleEmailPart = null,
    Subject: SimpleEmailPart = null,
    TextPart: SimpleEmailPart = null
  ): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEmail]
  }
}

