package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Aliases
trait Interval extends js.Object {
  var end: Date | Double
  var start: Date | Double
}

object Interval {
  @scala.inline
  def apply(end: Date | Double, start: Date | Double): Interval = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

