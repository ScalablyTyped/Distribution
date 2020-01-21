package typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod

import typings.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod.UnmarshalledSimpleEmailPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSimpleEmail extends SimpleEmail {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  @JSName("HtmlPart")
  var HtmlPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.undefined
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  @JSName("Subject")
  var Subject_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.undefined
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  @JSName("TextPart")
  var TextPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.undefined
}

object UnmarshalledSimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: UnmarshalledSimpleEmailPart = null,
    Subject: UnmarshalledSimpleEmailPart = null,
    TextPart: UnmarshalledSimpleEmailPart = null
  ): UnmarshalledSimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSimpleEmail]
  }
}

