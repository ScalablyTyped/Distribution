package typings.datatablesDotNet.DataTablesNs

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
    val __obj = js.Dynamic.literal(bBounding = bBounding, bScrollOversize = bScrollOversize, bScrollbarLeft = bScrollbarLeft, barWidth = barWidth)
  
    __obj.asInstanceOf[BrowserLegacy]
  }
}

