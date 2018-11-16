package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Camera")
@js.native
class Camera protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Camera {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
}

@JSImport("cesium", "Camera")
@js.native
object Camera extends js.Object {
  var DEFAULT_OFFSET: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange = js.native
  var DEFAULT_VIEW_FACTOR: scala.Double = js.native
  var DEFAULT_VIEW_RECTANGLE: cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
}

