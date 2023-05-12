package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.JulianDate
import typings.cesiumWidgets.mod.AnimationViewModel.DateFormatter
import typings.cesiumWidgets.mod.AnimationViewModel.TimeFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "AnimationViewModel")
@js.native
open class AnimationViewModel protected () extends StObject {
  def this(clockViewModel: ClockViewModel) = this()
  
  /**
    * Gets the clock view model.
    */
  var clockViewModel: ClockViewModel = js.native
  
  /**
    * Gets or sets the function which formats a date for display.
    */
  def dateFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  /**
    * Gets or sets the function which formats a date for display.
    */
  @JSName("dateFormatter")
  var dateFormatter_Original: DateFormatter = js.native
  
  /**
    * Gets the string representation of the current date.  This property is observable.
    */
  var dateLabel: String = js.native
  
  /**
    * Gets a command that increases the speed of animation.
    */
  var faster: Command = js.native
  
  /**
    * Gets a copy of the array of positive known clock multipliers to associate with the shuttle ring.
    * @returns The array of known clock multipliers associated with the shuttle ring.
    */
  def getShuttleRingTicks(): js.Array[Double] = js.native
  
  /**
    * Gets the string representation of the current multiplier.  This property is observable.
    */
  var multiplierLabel: String = js.native
  
  /**
    * Gets the pause toggle button view model.
    */
  var pauseViewModel: ToggleButtonViewModel = js.native
  
  /**
    * Gets the play toggle button view model.
    */
  var playForwardViewModel: ToggleButtonViewModel = js.native
  
  /**
    * Gets the realtime toggle button view model.
    */
  var playRealtimeViewModel: ToggleButtonViewModel = js.native
  
  /**
    * Gets the reverse toggle button view model.
    */
  var playReverseViewModel: ToggleButtonViewModel = js.native
  
  /**
    * Sets the array of positive known clock multipliers to associate with the shuttle ring.
    * These values will have negative equivalents created for them and sets both the minimum
    * and maximum range of values for the shuttle ring as well as the values that are snapped
    * to when a single click is made.  The values need not be in order, as they will be sorted
    * automatically, and duplicate values will be removed.
    * @param positiveTicks - The list of known positive clock multipliers to associate with the shuttle ring.
    */
  def setShuttleRingTicks(positiveTicks: js.Array[Double]): Unit = js.native
  
  /**
    * Gets or sets the current shuttle ring angle.  This property is observable.
    */
  var shuttleRingAngle: Double = js.native
  
  /**
    * Gets or sets whether the shuttle ring is currently being dragged.  This property is observable.
    */
  var shuttleRingDragging: Boolean = js.native
  
  /**
    * Gets a command that decreases the speed of animation.
    */
  var slower: Command = js.native
  
  /**
    * Gets or sets whether dragging the shuttle ring should cause the multiplier
    * to snap to the defined tick values rather than interpolating between them.
    * This property is observable.
    */
  var snapToTicks: Boolean = js.native
  
  /**
    * Gets or sets the function which formats a time for display.
    */
  def timeFormatter(date: JulianDate, viewModel: AnimationViewModel): String = js.native
  /**
    * Gets or sets the function which formats a time for display.
    */
  @JSName("timeFormatter")
  var timeFormatter_Original: TimeFormatter = js.native
  
  /**
    * Gets the string representation of the current time.  This property is observable.
    */
  var timeLabel: String = js.native
}
/* static members */
object AnimationViewModel {
  
  @JSImport("@cesium/widgets", "AnimationViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the default date formatter used by new instances.
    */
  @JSImport("@cesium/widgets", "AnimationViewModel.defaultDateFormatter")
  @js.native
  def defaultDateFormatter: DateFormatter = js.native
  /**
    * Gets or sets the default date formatter used by new instances.
    */
  inline def defaultDateFormatter(date: JulianDate, viewModel: AnimationViewModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDateFormatter")(date.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def defaultDateFormatter_=(x: DateFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDateFormatter")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default array of known clock multipliers associated with new instances of the shuttle ring.
    */
  @JSImport("@cesium/widgets", "AnimationViewModel.defaultTicks")
  @js.native
  def defaultTicks: js.Array[Double] = js.native
  inline def defaultTicks_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTicks")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default time formatter used by new instances.
    */
  @JSImport("@cesium/widgets", "AnimationViewModel.defaultTimeFormatter")
  @js.native
  def defaultTimeFormatter: TimeFormatter = js.native
  /**
    * Gets or sets the default time formatter used by new instances.
    */
  inline def defaultTimeFormatter(date: JulianDate, viewModel: AnimationViewModel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimeFormatter")(date.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def defaultTimeFormatter_=(x: TimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeFormatter")(x.asInstanceOf[js.Any])
  
  /**
    * A function that formats a date for display.
    * @param date - The date to be formatted
    * @param viewModel - The AnimationViewModel instance requesting formatting.
    */
  type DateFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
  
  /**
    * A function that formats a time for display.
    * @param date - The date to be formatted
    * @param viewModel - The AnimationViewModel instance requesting formatting.
    */
  type TimeFormatter = js.Function2[/* date */ JulianDate, /* viewModel */ AnimationViewModel, String]
}
