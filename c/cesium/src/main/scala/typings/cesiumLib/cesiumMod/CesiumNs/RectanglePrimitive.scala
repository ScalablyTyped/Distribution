package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectanglePrimitive extends js.Object {
  var asynchronous: scala.Boolean
  var debugShowBoundingVolume: scala.Boolean
  var ellipsoid: Ellipsoid
  var granularity: scala.Double
  var height: scala.Double
  var id: js.Any
  var material: Material
  var rectangle: Rectangle
  var rotation: scala.Double
  var show: scala.Boolean
  var textureRotationAngle: scala.Double
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(): scala.Unit
}

object RectanglePrimitive {
  @scala.inline
  def apply(
    asynchronous: scala.Boolean,
    debugShowBoundingVolume: scala.Boolean,
    destroy: js.Function0[scala.Unit],
    ellipsoid: Ellipsoid,
    granularity: scala.Double,
    height: scala.Double,
    id: js.Any,
    isDestroyed: js.Function0[scala.Boolean],
    material: Material,
    rectangle: Rectangle,
    rotation: scala.Double,
    show: scala.Boolean,
    textureRotationAngle: scala.Double,
    update: js.Function0[scala.Unit]
  ): RectanglePrimitive = {
    val __obj = js.Dynamic.literal(asynchronous = asynchronous, debugShowBoundingVolume = debugShowBoundingVolume, destroy = destroy, ellipsoid = ellipsoid, granularity = granularity, height = height, id = id, isDestroyed = isDestroyed, material = material, rectangle = rectangle, rotation = rotation, show = show, textureRotationAngle = textureRotationAngle, update = update)
  
    __obj.asInstanceOf[RectanglePrimitive]
  }
}

