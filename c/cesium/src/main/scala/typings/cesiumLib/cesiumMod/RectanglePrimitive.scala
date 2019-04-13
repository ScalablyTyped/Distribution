package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectanglePrimitive")
@js.native
class RectanglePrimitive () extends js.Object {
  def this(options: cesiumLib.Anon_Asynchronous) = this()
  var asynchronous: scala.Boolean = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var ellipsoid: Ellipsoid = js.native
  var granularity: scala.Double = js.native
  var height: scala.Double = js.native
  var id: js.Any = js.native
  var material: Material = js.native
  var rectangle: Rectangle = js.native
  var rotation: scala.Double = js.native
  var show: scala.Boolean = js.native
  var textureRotationAngle: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

