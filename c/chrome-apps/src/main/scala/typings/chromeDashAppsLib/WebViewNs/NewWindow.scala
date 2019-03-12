package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewWindow extends js.Object {
  /**
    * Attach the requested target page to an existing webview element.
    * @param webview The webview element to which the target page should be attached.
    */
  def attach(webview: chromeDashAppsLib.HTMLWebViewElement): scala.Unit
  /**
    * Cancel the new window request.
    */
  def discard(): scala.Unit
}

object NewWindow {
  @scala.inline
  def apply(attach: chromeDashAppsLib.HTMLWebViewElement => scala.Unit, discard: () => scala.Unit): NewWindow = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), discard = js.Any.fromFunction0(discard))
  
    __obj.asInstanceOf[NewWindow]
  }
}

