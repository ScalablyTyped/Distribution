package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  var start: scala.Double
  var stop: scala.Double
}

object Interval {
  @scala.inline
  def apply(start: scala.Double, stop: scala.Double): Interval = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
  
    __obj.asInstanceOf[Interval]
  }
}

