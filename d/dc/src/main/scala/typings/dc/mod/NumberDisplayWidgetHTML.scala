package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberDisplayWidgetHTML extends js.Object {
  var none: String
  var one: String
  var some: String
}

object NumberDisplayWidgetHTML {
  @scala.inline
  def apply(none: String, one: String, some: String): NumberDisplayWidgetHTML = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberDisplayWidgetHTML]
  }
}

