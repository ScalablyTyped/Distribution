package typings.datatablesDotNet.DataTables

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
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss, bCollapse = bCollapse, bInfinite = bInfinite, iBarWidth = iBarWidth, iLoadGap = iLoadGap, sX = sX, sY = sY)
  
    __obj.asInstanceOf[ScrollingLegacy]
  }
}

