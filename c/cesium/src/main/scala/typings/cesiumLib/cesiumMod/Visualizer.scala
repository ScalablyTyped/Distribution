package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Visualizer")
@js.native
abstract class Visualizer () extends js.Object {
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(time: JulianDate): scala.Boolean = js.native
}

