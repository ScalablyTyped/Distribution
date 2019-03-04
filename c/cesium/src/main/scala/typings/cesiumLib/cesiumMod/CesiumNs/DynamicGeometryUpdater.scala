package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicGeometryUpdater extends js.Object {
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(time: JulianDate): scala.Unit
}

object DynamicGeometryUpdater {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    update: js.Function1[JulianDate, scala.Unit]
  ): DynamicGeometryUpdater = {
    val __obj = js.Dynamic.literal(destroy = destroy, isDestroyed = isDestroyed, update = update)
  
    __obj.asInstanceOf[DynamicGeometryUpdater]
  }
}

