package typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod

import typings.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod.SimpleEmailPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmail extends js.Object {
  /**
    * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.native
  /**
    * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.native
}

object SimpleEmail {
  @scala.inline
  def apply(): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmail]
  }
  @scala.inline
  implicit class SimpleEmailOps[Self <: SimpleEmail] (val x: Self) extends AnyVal {
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
    def setHtmlPart(value: SimpleEmailPart): Self = this.set("HtmlPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlPart: Self = this.set("HtmlPart", js.undefined)
    @scala.inline
    def setSubject(value: SimpleEmailPart): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    @scala.inline
    def setTextPart(value: SimpleEmailPart): Self = this.set("TextPart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPart: Self = this.set("TextPart", js.undefined)
  }
  
}

