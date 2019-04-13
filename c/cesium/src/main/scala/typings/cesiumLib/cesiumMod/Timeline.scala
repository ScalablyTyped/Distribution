package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Timeline")
@js.native
class Timeline protected () extends js.Object {
  def this(container: stdLib.Element, clock: Clock) = this()
  var container: stdLib.Element = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def resize(): scala.Unit = js.native
  def zoomTo(startTime: JulianDate, stopTime: JulianDate): scala.Unit = js.native
}

