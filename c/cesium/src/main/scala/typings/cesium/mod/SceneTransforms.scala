package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneTransforms")
@js.native
object SceneTransforms extends js.Object {
  def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = js.native
  def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = js.native
  def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = js.native
}

