package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLegacy extends js.Object {
  var bBounding: scala.Boolean
  var bScrollOversize: scala.Boolean
  var bScrollbarLeft: scala.Boolean
  var barWidth: scala.Double
}

object BrowserLegacy {
  @scala.inline
  def apply(
    bBounding: scala.Boolean,
    bScrollOversize: scala.Boolean,
    bScrollbarLeft: scala.Boolean,
    barWidth: scala.Double
  ): BrowserLegacy = {
    val __obj = js.Dynamic.literal(bBounding = bBounding, bScrollOversize = bScrollOversize, bScrollbarLeft = bScrollbarLeft, barWidth = barWidth)
  
    __obj.asInstanceOf[BrowserLegacy]
  }
}

