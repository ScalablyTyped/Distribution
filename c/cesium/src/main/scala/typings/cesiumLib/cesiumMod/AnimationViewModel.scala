package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AnimationViewModel")
@js.native
class AnimationViewModel protected () extends js.Object {
  def this(clockViewModel: ClockViewModel) = this()
  var clockViewModel: ClockViewModel = js.native
  @JSName("dateFormatter")
  var dateFormatter_Original: cesiumLib.cesiumMod.AnimationViewModelNs.DateFormatter = js.native
  var dateLabel: java.lang.String = js.native
  var faster: Command = js.native
  var multiplierLabel: java.lang.String = js.native
  var pauseViewModel: ToggleButtonViewModel = js.native
  var playForwardViewModel: ToggleButtonViewModel = js.native
  var playRealtimeViewModel: ToggleButtonViewModel = js.native
  var playReverseViewModel: ToggleButtonViewModel = js.native
  var shuttleRingAngle: scala.Double = js.native
  var shuttleRingDragging: scala.Boolean = js.native
  var slower: Command = js.native
  var snapToTicks: scala.Boolean = js.native
  @JSName("timeFormatter")
  var timeFormatter_Original: cesiumLib.cesiumMod.AnimationViewModelNs.TimeFormatter = js.native
  var timeLabel: java.lang.String = js.native
  def dateFormatter(date: JulianDate, viewModel: AnimationViewModel): java.lang.String = js.native
  def getShuttleRingTicks(): js.Array[scala.Double] = js.native
  def setShuttleRingTicks(positiveTicks: js.Array[scala.Double]): scala.Unit = js.native
  def timeFormatter(date: JulianDate, viewModel: AnimationViewModel): java.lang.String = js.native
}

/* static members */
@JSImport("cesium", "AnimationViewModel")
@js.native
object AnimationViewModel extends js.Object {
  @JSName("defaultDateFormatter")
  var defaultDateFormatter_Original: cesiumLib.cesiumMod.AnimationViewModelNs.DateFormatter = js.native
  var defaultTicks: js.Array[scala.Double] = js.native
  @JSName("defaultTimeFormatter")
  var defaultTimeFormatter_Original: cesiumLib.cesiumMod.AnimationViewModelNs.TimeFormatter = js.native
  def defaultDateFormatter(date: cesiumLib.cesiumMod.JulianDate, viewModel: cesiumLib.cesiumMod.AnimationViewModel): java.lang.String = js.native
  def defaultTimeFormatter(date: cesiumLib.cesiumMod.JulianDate, viewModel: cesiumLib.cesiumMod.AnimationViewModel): java.lang.String = js.native
}

