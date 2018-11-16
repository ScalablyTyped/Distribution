package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineCollection extends js.Object {
  var debugShowBoundingVolume: scala.Boolean = js.native
  var length: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Polyline = js.native
  def add(polyline: js.Any): Polyline = js.native
  def contains(polyline: Polyline): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): Polyline = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(polyline: Polyline): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
}

