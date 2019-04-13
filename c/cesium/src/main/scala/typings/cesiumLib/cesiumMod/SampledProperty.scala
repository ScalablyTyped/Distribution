package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SampledProperty")
@js.native
class SampledProperty protected () extends PositionProperty {
  def this(`type`: Packable) = this()
  def this(`type`: scala.Double) = this()
  def this(`type`: Packable, derivativeTypes: js.Array[Packable]) = this()
  def this(`type`: scala.Double, derivativeTypes: js.Array[Packable]) = this()
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
  def setInterpolationOptions(options: cesiumLib.Anon_InterpolationAlgorithm): scala.Unit = js.native
}

