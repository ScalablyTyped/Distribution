package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SampledPositionProperty")
@js.native
class SampledPositionProperty () extends SampledProperty {
  def this(referenceFrame: ReferenceFrame) = this()
  def this(referenceFrame: ReferenceFrame, numberOfDerivatives: Double) = this()
  var numberOfDerivatives: Boolean = js.native
  def addSample(time: JulianDate, position: Cartesian3): Unit = js.native
  def addSample(time: JulianDate, position: Cartesian3, derivatives: js.Array[Cartesian3]): Unit = js.native
}

