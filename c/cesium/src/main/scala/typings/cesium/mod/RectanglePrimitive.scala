package typings.cesium.mod

import typings.cesium.AnonAsynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectanglePrimitive")
@js.native
class RectanglePrimitive () extends js.Object {
  def this(options: AnonAsynchronous) = this()
  var asynchronous: Boolean = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var ellipsoid: Ellipsoid = js.native
  var granularity: Double = js.native
  var height: Double = js.native
  var id: js.Any = js.native
  var material: Material = js.native
  var rectangle: Rectangle = js.native
  var rotation: Double = js.native
  var show: Boolean = js.native
  var textureRotationAngle: Double = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

