package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSimpleEmailPartMod._UnmarshalledSimpleEmailPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSimpleEmail extends _SimpleEmail {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  @JSName("HtmlPart")
  var HtmlPart__UnmarshalledSimpleEmail: js.UndefOr[_UnmarshalledSimpleEmailPart] = js.undefined
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  @JSName("Subject")
  var Subject__UnmarshalledSimpleEmail: js.UndefOr[_UnmarshalledSimpleEmailPart] = js.undefined
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  @JSName("TextPart")
  var TextPart__UnmarshalledSimpleEmail: js.UndefOr[_UnmarshalledSimpleEmailPart] = js.undefined
}

object _UnmarshalledSimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: _UnmarshalledSimpleEmailPart = null,
    Subject: _UnmarshalledSimpleEmailPart = null,
    TextPart: _UnmarshalledSimpleEmailPart = null
  ): _UnmarshalledSimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    __obj.asInstanceOf[_UnmarshalledSimpleEmail]
  }
}

