package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationViewModel extends js.Object {
  var clockViewModel: ClockViewModel = js.native
  @JSName("dateFormatter")
  var dateFormatter_Original: cesiumLib.cesiumMod.CesiumNs.AnimationViewModelNs.DateFormatter = js.native
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
  var timeFormatter_Original: cesiumLib.cesiumMod.CesiumNs.AnimationViewModelNs.TimeFormatter = js.native
  var timeLabel: java.lang.String = js.native
  def dateFormatter(date: JulianDate, viewModel: AnimationViewModel): java.lang.String = js.native
  def getShuttleRingTicks(): js.Array[scala.Double] = js.native
  def setShuttleRingTicks(positiveTicks: js.Array[scala.Double]): scala.Unit = js.native
  def timeFormatter(date: JulianDate, viewModel: AnimationViewModel): java.lang.String = js.native
}

