package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElementTagNameMap extends js.Object {
  var appview: HTMLAppViewElement
  var webview: HTMLWebViewElement
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(appview: HTMLAppViewElement, webview: HTMLWebViewElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(appview = appview.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
}

