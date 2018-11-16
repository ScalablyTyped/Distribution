package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceClock extends js.Object {
  var clockRange: ClockRange = js.native
  var clockStep: ClockStep = js.native
  var currentTime: JulianDate = js.native
  var definitionChanged: Event = js.native
  var multiplier: scala.Double = js.native
  var startTime: JulianDate = js.native
  var stopTime: JulianDate = js.native
  def clone(result: DataSourceClock): DataSourceClock = js.native
  def equals(other: DataSourceClock): scala.Boolean = js.native
  def getValue(): Clock = js.native
  def merge(source: DataSourceClock): DataSourceClock = js.native
}

