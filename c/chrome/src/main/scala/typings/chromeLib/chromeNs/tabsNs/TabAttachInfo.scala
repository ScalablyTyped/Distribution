package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabAttachInfo extends js.Object {
  var newPosition: scala.Double
  var newWindowId: scala.Double
}

object TabAttachInfo {
  @scala.inline
  def apply(newPosition: scala.Double, newWindowId: scala.Double): TabAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition, newWindowId = newWindowId)
  
    __obj.asInstanceOf[TabAttachInfo]
  }
}

