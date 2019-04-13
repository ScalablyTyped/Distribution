package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneTransforms")
@js.native
object SceneTransformsNs extends js.Object {
  def wgs84ToDrawingBufferCoordinates(scene: cesiumLib.cesiumMod.Scene, position: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian2 = js.native
  def wgs84ToDrawingBufferCoordinates(
    scene: cesiumLib.cesiumMod.Scene,
    position: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def wgs84ToWindowCoordinates(scene: cesiumLib.cesiumMod.Scene, position: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian2 = js.native
  def wgs84ToWindowCoordinates(
    scene: cesiumLib.cesiumMod.Scene,
    position: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
}

