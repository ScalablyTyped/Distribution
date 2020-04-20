package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollingLegacy extends js.Object {
  var bAutoCss: Boolean
  var bCollapse: Boolean
  var bInfinite: Boolean
  var iBarWidth: Double
  var iLoadGap: Double
  var sX: String
  var sY: String
}

object ScrollingLegacy {
  @scala.inline
  def apply(
    bAutoCss: Boolean,
    bCollapse: Boolean,
    bInfinite: Boolean,
    iBarWidth: Double,
    iLoadGap: Double,
    sX: String,
    sY: String
  ): ScrollingLegacy = {
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss.asInstanceOf[js.Any], bCollapse = bCollapse.asInstanceOf[js.Any], bInfinite = bInfinite.asInstanceOf[js.Any], iBarWidth = iBarWidth.asInstanceOf[js.Any], iLoadGap = iLoadGap.asInstanceOf[js.Any], sX = sX.asInstanceOf[js.Any], sY = sY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingLegacy]
  }
}

