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

