package typings.chromeDashApps.WebView

import typings.chromeDashApps.HTMLWebViewElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewWindow extends js.Object {
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: HTMLWebViewElement): Unit
  /**
    * Cancel the new window request.
    */
  def discard(): Unit
}

object NewWindow {
  @scala.inline
  def apply(attach: HTMLWebViewElement => Unit, discard: () => Unit): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), discard = js.Any.fromFunction0(discard))
  
    __obj.asInstanceOf[NewWindow]
  }
}

