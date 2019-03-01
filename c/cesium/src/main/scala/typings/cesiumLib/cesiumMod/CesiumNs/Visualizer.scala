package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visualizer extends js.Object {
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(time: JulianDate): scala.Boolean
}

object Visualizer {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    update: js.Function1[JulianDate, scala.Boolean]
  ): Visualizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Visualizer]
  }
}

