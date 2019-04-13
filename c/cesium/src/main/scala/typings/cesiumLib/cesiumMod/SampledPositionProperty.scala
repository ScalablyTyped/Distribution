package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SampledPositionProperty")
@js.native
class SampledPositionProperty () extends SampledProperty {
  def this(referenceFrame: ReferenceFrame) = this()
  def this(referenceFrame: ReferenceFrame, numberOfDerivatives: scala.Double) = this()
  var numberOfDerivatives: scala.Boolean = js.native
  def addSample(time: JulianDate, position: Cartesian3): scala.Unit = js.native
  def addSample(time: JulianDate, position: Cartesian3, derivatives: js.Array[Cartesian3]): scala.Unit = js.native
}

