package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLegacy extends js.Object {
  var bBounding: Boolean
  var bScrollOversize: Boolean
  var bScrollbarLeft: Boolean
  var barWidth: Double
}

object BrowserLegacy {
  @scala.inline
  def apply(bBounding: Boolean, bScrollOversize: Boolean, bScrollbarLeft: Boolean, barWidth: Double): BrowserLegacy = {
    val __obj = js.Dynamic.literal(bBounding = bBounding.asInstanceOf[js.Any], bScrollOversize = bScrollOversize.asInstanceOf[js.Any], bScrollbarLeft = bScrollbarLeft.asInstanceOf[js.Any], barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLegacy]
  }
}

