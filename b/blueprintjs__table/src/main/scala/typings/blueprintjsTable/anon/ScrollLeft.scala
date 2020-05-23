package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollLeft extends js.Object {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollLeft {
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollLeft = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollLeft]
  }
}

