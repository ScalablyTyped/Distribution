package typings
package datatablesDotNetDashScrollerLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * start: {int}, // the 0-indexed record at the top of the viewport
  * end:   {int}, // the 0-indexed record at the bottom of the viewport
  */
trait PageInfo extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object PageInfo {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): PageInfo = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[PageInfo]
  }
}

