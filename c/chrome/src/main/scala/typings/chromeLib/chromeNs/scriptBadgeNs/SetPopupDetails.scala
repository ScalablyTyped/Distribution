package typings
package chromeLib.chromeNs.scriptBadgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPopupDetails extends js.Object {
  var popup: java.lang.String
  var tabId: scala.Double
}

object SetPopupDetails {
  @scala.inline
  def apply(popup: java.lang.String, tabId: scala.Double): SetPopupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("popup")(popup)
    __obj.updateDynamic("tabId")(tabId)
    __obj.asInstanceOf[SetPopupDetails]
  }
}

