package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AnimationViewModel")
@js.native
class AnimationViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.AnimationViewModel {
  def this(clockViewModel: cesiumLib.cesiumMod.CesiumNs.ClockViewModel) = this()
}

@JSImport("cesium", "AnimationViewModel")
@js.native
object AnimationViewModel extends js.Object {
  @JSName("defaultDateFormatter")
  var defaultDateFormatter_Original: cesiumLib.cesiumMod.CesiumNs.AnimationViewModelNs.DateFormatter = js.native
  var defaultTicks: js.Array[scala.Double] = js.native
  @JSName("defaultTimeFormatter")
  var defaultTimeFormatter_Original: cesiumLib.cesiumMod.CesiumNs.AnimationViewModelNs.TimeFormatter = js.native
  def defaultDateFormatter(
    date: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    viewModel: cesiumLib.cesiumMod.CesiumNs.AnimationViewModel
  ): java.lang.String = js.native
  def defaultTimeFormatter(
    date: cesiumLib.cesiumMod.CesiumNs.JulianDate,
    viewModel: cesiumLib.cesiumMod.CesiumNs.AnimationViewModel
  ): java.lang.String = js.native
}

