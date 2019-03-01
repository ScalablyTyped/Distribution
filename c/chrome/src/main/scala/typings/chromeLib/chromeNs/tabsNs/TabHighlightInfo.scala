package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabHighlightInfo extends js.Object {
  var tabIds: js.Array[scala.Double]
  var windowId: scala.Double
}

object TabHighlightInfo {
  @scala.inline
  def apply(tabIds: js.Array[scala.Double], windowId: scala.Double): TabHighlightInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabIds")(tabIds)
    __obj.updateDynamic("windowId")(windowId)
    __obj.asInstanceOf[TabHighlightInfo]
  }
}

