package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ray extends js.Object {
  var direction: Cartesian3
  var origin: Cartesian3
}

object Ray {
  @scala.inline
  def apply(direction: Cartesian3, origin: Cartesian3): Ray = {
    val __obj = js.Dynamic.literal(direction = direction, origin = origin)
  
    __obj.asInstanceOf[Ray]
  }
}

