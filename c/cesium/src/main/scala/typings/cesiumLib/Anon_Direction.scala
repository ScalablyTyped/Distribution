package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: cesiumLib.cesiumMod.Cartesian3
  var up: cesiumLib.cesiumMod.Cartesian3
}

object Anon_Direction {
  @scala.inline
  def apply(direction: cesiumLib.cesiumMod.Cartesian3, up: cesiumLib.cesiumMod.Cartesian3): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, up = up)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

