package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Clock
import typings.cesiumEngine.mod.ClockRange
import typings.cesiumEngine.mod.ClockStep
import typings.cesiumEngine.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "ClockViewModel")
@js.native
open class ClockViewModel () extends StObject {
  def this(clock: Clock) = this()
  
  /**
    * Gets or sets whether the clock can animate.
    * See {@link Clock#canAnimate}.
    * This property is observable.
    */
  var canAnimate: Boolean = js.native
  
  /**
    * Gets the underlying Clock.
    */
  var clock: Clock = js.native
  
  /**
    * Gets or sets the clock range setting.
    * See {@link Clock#clockRange}.
    * This property is observable.
    */
  var clockRange: ClockRange = js.native
  
  /**
    * Gets or sets the clock step setting.
    * See {@link Clock#clockStep}.
    * This property is observable.
    */
  var clockStep: ClockStep = js.native
  
  /**
    * Gets or sets the current time.
    * See {@link Clock#currentTime}.
    * This property is observable.
    */
  var currentTime: JulianDate = js.native
  
  /**
    * Destroys the view model.  Should be called to
    * properly clean up the view model when it is no longer needed.
    */
  def destroy(): Unit = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets the clock multiplier.
    * See {@link Clock#multiplier}.
    * This property is observable.
    */
  var multiplier: Double = js.native
  
  /**
    * Gets or sets whether the clock should animate.
    * See {@link Clock#shouldAnimate}.
    * This property is observable.
    */
  var shouldAnimate: Boolean = js.native
  
  /**
    * Gets or sets the start time of the clock.
    * See {@link Clock#startTime}.
    * This property is observable.
    */
  var startTime: JulianDate = js.native
  
  /**
    * Gets or sets the stop time of the clock.
    * See {@link Clock#stopTime}.
    * This property is observable.
    */
  var stopTime: JulianDate = js.native
  
  /**
    * Updates the view model with the contents of the underlying clock.
    * Can be called to force an update of the viewModel if the underlying
    * clock has changed and <code>Clock.tick</code> has not yet been called.
    */
  def synchronize(): Unit = js.native
  
  /**
    * Gets the current system time.
    * This property is observable.
    */
  var systemTime: JulianDate = js.native
}
