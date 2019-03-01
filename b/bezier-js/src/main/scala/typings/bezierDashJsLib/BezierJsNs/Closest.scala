package typings
package bezierDashJsLib.BezierJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Closest extends js.Object {
  var mdist: scala.Double
  var mpos: scala.Double
}

object Closest {
  @scala.inline
  def apply(mdist: scala.Double, mpos: scala.Double): Closest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mdist")(mdist)
    __obj.updateDynamic("mpos")(mpos)
    __obj.asInstanceOf[Closest]
  }
}

