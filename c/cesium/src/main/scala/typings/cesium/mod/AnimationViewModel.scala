package typings.cesium.mod

import typings.cesium.mod.AnimationViewModel.DateFormatter
import typings.cesium.mod.AnimationViewModel.TimeFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "AnimationViewModel")
@js.native
class AnimationViewModel protected () extends js.Object {
  def this(clockViewModel: ClockViewModel) = this()
  
  var clockViewModel: ClockViewModel = js.native
  
  def dateFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  @JSName("dateFormatter")
  var dateFormatter_Original: DateFormatter = js.native
  
  var dateLabel: String = js.native
  
  var faster: Command = js.native
  
  def getShuttleRingTicks(): js.Array[Double] = js.native
  
  var multiplierLabel: String = js.native
  
  var pauseViewModel: ToggleButtonViewModel = js.native
  
  var playForwardViewModel: ToggleButtonViewModel = js.native
  
  var playRealtimeViewModel: ToggleButtonViewModel = js.native
  
  var playReverseViewModel: ToggleButtonViewModel = js.native
  
  def setShuttleRingTicks(positiveTicks: js.Array[Double]): Unit = js.native
  
  var shuttleRingAngle: Double = js.native
  
  var shuttleRingDragging: Boolean = js.native
  
  var slower: Command = js.native
  
  var snapToTicks: Boolean = js.native
  
  def timeFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  @JSName("timeFormatter")
  var timeFormatter_Original: TimeFormatter = js.native
  
  var timeLabel: String = js.native
}
/* static members */
@JSImport("cesium", "AnimationViewModel")
@js.native
object AnimationViewModel extends js.Object {
  
  def defaultDateFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  @JSName("defaultDateFormatter")
  var defaultDateFormatter_Original: DateFormatter = js.native
  
  var defaultTicks: js.Array[Double] = js.native
  
  def defaultTimeFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  @JSName("defaultTimeFormatter")
  var defaultTimeFormatter_Original: TimeFormatter = js.native
  
  type DateFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
  
  type TimeFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
}
