package typings.computeScrollIntoView.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScrollAction extends js.Object {
  var el: Element
  var left: Double
  var top: Double
}

object CustomScrollAction {
  @scala.inline
  def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomScrollAction]
  }
}

