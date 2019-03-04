package typings
package chromeDashAppsLib

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
    val __obj = js.Dynamic.literal(appview = appview, webview = webview)
  
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
}

