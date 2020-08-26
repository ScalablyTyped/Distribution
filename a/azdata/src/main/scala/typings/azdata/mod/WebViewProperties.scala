package typings.azdata.mod

import typings.vscode.mod.WebviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewProperties extends ComponentProperties {
  /**
    * Contents of the webview.
    *
    * Should be a complete html document.
    */
  var html: js.UndefOr[String] = js.native
  var message: js.UndefOr[js.Any] = js.native
  /**
    * Content settings for the webview.
    */
  var options: js.UndefOr[WebviewOptions] = js.native
}

object WebViewProperties {
  @scala.inline
  def apply(): WebViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewProperties]
  }
  @scala.inline
  implicit class WebViewPropertiesOps[Self <: WebViewProperties] (val x: Self) extends AnyVal {
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOptions(value: WebviewOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

