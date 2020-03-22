package typings.cesium.mod

import typings.cesium.AnonDebugShowBoundingVolumeModelMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineCollection")
@js.native
class PolylineCollection () extends js.Object {
  def this(options: AnonDebugShowBoundingVolumeModelMatrix) = this()
  var debugShowBoundingVolume: Boolean = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  def add(): Polyline = js.native
  def add(polyline: js.Any): Polyline = js.native
  def contains(polyline: Polyline): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): Polyline = js.native
  def isDestroyed(): Boolean = js.native
  def remove(polyline: Polyline): Boolean = js.native
  def removeAll(): Unit = js.native
}

