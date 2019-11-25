package typings.chrome.chrome.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventFilter extends js.Object {
  /**
    * Conditions that the window's type being created must satisfy. By default it will satisfy ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
    * Each one of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowTypes: js.Array[String]
}

object WindowEventFilter {
  @scala.inline
  def apply(windowTypes: js.Array[String]): WindowEventFilter = {
    val __obj = js.Dynamic.literal(windowTypes = windowTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowEventFilter]
  }
}

