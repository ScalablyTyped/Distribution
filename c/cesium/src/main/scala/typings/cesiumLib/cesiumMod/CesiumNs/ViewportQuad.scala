package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportQuad extends js.Object {
  var material: Material
  var rectangle: BoundingRectangle
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object ViewportQuad {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    material: Material,
    rectangle: BoundingRectangle,
    show: scala.Boolean,
    update: js.Function0[scala.Unit]
  ): ViewportQuad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("isDestroyed")(isDestroyed)
    __obj.updateDynamic("material")(material)
    __obj.updateDynamic("rectangle")(rectangle)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ViewportQuad]
  }
}

