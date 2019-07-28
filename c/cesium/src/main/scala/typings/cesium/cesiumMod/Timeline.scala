package typings.cesium.cesiumMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Timeline")
@js.native
class Timeline protected () extends js.Object {
  def this(container: Element, clock: Clock) = this()
  var container: Element = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def resize(): Unit = js.native
  def zoomTo(startTime: JulianDate, stopTime: JulianDate): Unit = js.native
}

