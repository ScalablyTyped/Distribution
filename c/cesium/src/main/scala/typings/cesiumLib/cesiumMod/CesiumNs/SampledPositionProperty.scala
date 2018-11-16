package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledPositionProperty extends SampledProperty {
  var numberOfDerivatives: scala.Boolean = js.native
  def addSample(time: JulianDate, position: Cartesian3): scala.Unit = js.native
  def addSample(time: JulianDate, position: Cartesian3, derivatives: js.Array[Cartesian3]): scala.Unit = js.native
}

