package typings.betterDashScroll.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClick extends js.Object {
  var delay: Double
}

object DoubleClick {
  @scala.inline
  def apply(delay: Double): DoubleClick = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DoubleClick]
  }
}

