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

