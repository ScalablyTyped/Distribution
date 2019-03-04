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
    val __obj = js.Dynamic.literal(destroy = destroy, isDestroyed = isDestroyed, material = material, rectangle = rectangle, show = show, update = update)
  
    __obj.asInstanceOf[ViewportQuad]
  }
}

