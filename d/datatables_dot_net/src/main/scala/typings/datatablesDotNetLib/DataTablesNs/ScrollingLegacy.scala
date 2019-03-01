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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bAutoCss")(bAutoCss)
    __obj.updateDynamic("bCollapse")(bCollapse)
    __obj.updateDynamic("bInfinite")(bInfinite)
    __obj.updateDynamic("iBarWidth")(iBarWidth)
    __obj.updateDynamic("iLoadGap")(iLoadGap)
    __obj.updateDynamic("sX")(sX)
    __obj.updateDynamic("sY")(sY)
    __obj.asInstanceOf[ScrollingLegacy]
  }
}

