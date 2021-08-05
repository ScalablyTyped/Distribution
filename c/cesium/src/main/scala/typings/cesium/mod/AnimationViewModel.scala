package typings.cesium.mod

import typings.cesium.mod.AnimationViewModel.DateFormatter
import typings.cesium.mod.AnimationViewModel.TimeFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "AnimationViewModel")
@js.native
class AnimationViewModel protected () extends StObject {
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
object AnimationViewModel {
  
  @JSImport("cesium", "AnimationViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "AnimationViewModel.defaultDateFormatter")
  @js.native
  def defaultDateFormatter: DateFormatter = js.native
  inline def defaultDateFormatter_=(x: DateFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDateFormatter")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "AnimationViewModel.defaultTicks")
  @js.native
  def defaultTicks: js.Array[Double] = js.native
  inline def defaultTicks_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTicks")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "AnimationViewModel.defaultTimeFormatter")
  @js.native
  def defaultTimeFormatter: TimeFormatter = js.native
  inline def defaultTimeFormatter_=(x: TimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeFormatter")(x.asInstanceOf[js.Any])
  
  type DateFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
  
  type TimeFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
}
