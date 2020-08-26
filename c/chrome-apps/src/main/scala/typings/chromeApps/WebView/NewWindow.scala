package typings.chromeApps.WebView

import typings.chromeApps.HTMLWebViewElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewWindow extends js.Object {
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit = js.native
  /**
    * Cancel the new window request.
    */
  def discard(): Unit = js.native
}

object NewWindow {
  @scala.inline
  def apply(attach: HTMLWebViewElement => Unit, discard: () => Unit): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), discard = js.Any.fromFunction0(discard))
    __obj.asInstanceOf[NewWindow]
  }
  @scala.inline
  implicit class NewWindowOps[Self <: NewWindow] (val x: Self) extends AnyVal {
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
    def setAttach(value: HTMLWebViewElement => Unit): Self = this.set("attach", js.Any.fromFunction1(value))
    @scala.inline
    def setDiscard(value: () => Unit): Self = this.set("discard", js.Any.fromFunction0(value))
  }
  
}

