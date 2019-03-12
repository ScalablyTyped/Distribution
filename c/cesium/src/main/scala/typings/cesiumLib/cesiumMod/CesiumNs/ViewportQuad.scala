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
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    material: Material,
    rectangle: BoundingRectangle,
    show: scala.Boolean,
    update: () => scala.Unit
  ): ViewportQuad = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), material = material, rectangle = rectangle, show = show, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[ViewportQuad]
  }
}

