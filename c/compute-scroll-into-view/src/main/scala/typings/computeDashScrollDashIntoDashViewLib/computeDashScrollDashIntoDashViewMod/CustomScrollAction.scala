package typings
package computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomScrollAction extends js.Object {
  var el: stdLib.Element
  var left: scala.Double
  var top: scala.Double
}

object CustomScrollAction {
  @scala.inline
  def apply(el: stdLib.Element, left: scala.Double, top: scala.Double): CustomScrollAction = {
    val __obj = js.Dynamic.literal(el = el, left = left, top = top)
  
    __obj.asInstanceOf[CustomScrollAction]
  }
}

