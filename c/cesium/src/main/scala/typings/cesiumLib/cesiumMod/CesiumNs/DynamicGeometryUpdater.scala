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
  def apply(destroy: () => scala.Unit, isDestroyed: () => scala.Boolean, update: JulianDate => scala.Unit): DynamicGeometryUpdater = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DynamicGeometryUpdater]
  }
}

