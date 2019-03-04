package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsoidPrimitive extends js.Object {
  var center: Cartesian3
  var debugShowBoundingVolume: scala.Boolean
  var id: js.Any
  var material: Material
  var modelMatrix: Matrix4
  var radii: Cartesian3
  var show: scala.Boolean
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object EllipsoidPrimitive {
  @scala.inline
  def apply(
    center: Cartesian3,
    debugShowBoundingVolume: scala.Boolean,
    destroy: js.Function0[scala.Unit],
    id: js.Any,
    isDestroyed: js.Function0[scala.Boolean],
    material: Material,
    modelMatrix: Matrix4,
    radii: Cartesian3,
    show: scala.Boolean,
    update: js.Function0[scala.Unit]
  ): EllipsoidPrimitive = {
    val __obj = js.Dynamic.literal(center = center, debugShowBoundingVolume = debugShowBoundingVolume, destroy = destroy, id = id, isDestroyed = isDestroyed, material = material, modelMatrix = modelMatrix, radii = radii, show = show, update = update)
  
    __obj.asInstanceOf[EllipsoidPrimitive]
  }
}

