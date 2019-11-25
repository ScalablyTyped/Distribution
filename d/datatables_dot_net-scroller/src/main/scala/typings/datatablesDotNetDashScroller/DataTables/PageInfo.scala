package typings.datatablesDotNetDashScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * start: {int}, // the 0-indexed record at the top of the viewport
  * end:   {int}, // the 0-indexed record at the bottom of the viewport
  */
trait PageInfo extends js.Object {
  var end: Double
  var start: Double
}

object PageInfo {
  @scala.inline
  def apply(end: Double, start: Double): PageInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageInfo]
  }
}

