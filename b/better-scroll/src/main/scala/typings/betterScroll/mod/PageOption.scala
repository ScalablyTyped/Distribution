package typings.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOption extends js.Object {
  var pageX: Double
  var pageY: Double
  var x: Double
  var y: Double
}

object PageOption {
  @scala.inline
  def apply(pageX: Double, pageY: Double, x: Double, y: Double): PageOption = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageOption]
  }
}

