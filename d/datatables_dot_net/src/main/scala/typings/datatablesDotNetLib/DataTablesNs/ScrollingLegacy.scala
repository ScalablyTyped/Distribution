package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollingLegacy extends js.Object {
  var bAutoCss: scala.Boolean
  var bCollapse: scala.Boolean
  var bInfinite: scala.Boolean
  var iBarWidth: scala.Double
  var iLoadGap: scala.Double
  var sX: java.lang.String
  var sY: java.lang.String
}

object ScrollingLegacy {
  @scala.inline
  def apply(
    bAutoCss: scala.Boolean,
    bCollapse: scala.Boolean,
    bInfinite: scala.Boolean,
    iBarWidth: scala.Double,
    iLoadGap: scala.Double,
    sX: java.lang.String,
    sY: java.lang.String
  ): ScrollingLegacy = {
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss, bCollapse = bCollapse, bInfinite = bInfinite, iBarWidth = iBarWidth, iLoadGap = iLoadGap, sX = sX, sY = sY)
  
    __obj.asInstanceOf[ScrollingLegacy]
  }
}

