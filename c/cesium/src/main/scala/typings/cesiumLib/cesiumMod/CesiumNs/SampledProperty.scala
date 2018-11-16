package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledProperty extends PositionProperty {
  var backwardExtrapolationDuration: scala.Double = js.native
  var backwardExtrapolationType: ExtrapolationType = js.native
  var derivativeTypes: js.Array[Packable] = js.native
  var forwardExtrapolationDuration: scala.Double = js.native
  var forwardExtrapolationType: ExtrapolationType = js.native
  var interpolationAlgorithm: InterpolationAlgorithm = js.native
  var interpolationDegree: scala.Double = js.native
  var `type`: js.Any = js.native
  def addSample(time: JulianDate, value: Packable): scala.Unit = js.native
  def addSample(time: JulianDate, value: Packable, derivatives: js.Array[Packable]): scala.Unit = js.native
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable]): scala.Unit = js.native
  def addSamples(times: js.Array[JulianDate], values: js.Array[Packable], derivativeValues: js.Array[js.Array[_]]): scala.Unit = js.native
  def addSamplesPackedArray(packedSamples: js.Array[scala.Double]): scala.Unit = js.native
  def addSamplesPackedArray(packedSamples: js.Array[scala.Double], epoch: JulianDate): scala.Unit = js.native
  def setInterpolationOptions(): scala.Unit = js.native
  def setInterpolationOptions(options: cesiumLib.Anon_InterpolationDegree): scala.Unit = js.native
}

