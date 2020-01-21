package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRange extends js.Object {
  var end: Double
  var start: Double
}

object PageRange {
  @scala.inline
  def apply(end: Double, start: Double): PageRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageRange]
  }
}

