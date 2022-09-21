package typings.cesium.mod

import typings.cesium.anon.CanAnimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Clock")
@js.native
open class Clock () extends StObject {
  def this(options: CanAnimate) = this()
  
  /**
    * Indicates whether {@link Clock#tick} can advance time.  This could be false if data is being buffered,
    * for example.  The clock will only advance time when both
    * {@link Clock#canAnimate} and {@link Clock#shouldAnimate} are true.
    */
  var canAnimate: Boolean = js.native
  
  /**
    * Determines how the clock should behave when
    * {@link Clock#startTime} or {@link Clock#stopTime}
    * is reached.
    */
  var clockRange: ClockRange = js.native
  
  /**
    * Determines if calls to {@link Clock#tick} are frame dependent or system clock dependent.
    * Changing this property to {@link ClockStep.SYSTEM_CLOCK} will set
    * {@link Clock#multiplier} to 1.0, {@link Clock#shouldAnimate} to true, and
    * {@link Clock#currentTime} to the current system clock time.
    */
  var clockStep: ClockStep = js.native
  
  /**
    * The current time.
    * Changing this property will change
    * {@link Clock#clockStep} from {@link ClockStep.SYSTEM_CLOCK} to
    * {@link ClockStep.SYSTEM_CLOCK_MULTIPLIER}.
    */
  var currentTime: JulianDate = js.native
  
  /**
    * Gets or sets how much time advances when {@link Clock#tick} is called. Negative values allow for advancing backwards.
    * If {@link Clock#clockStep} is set to {@link ClockStep.TICK_DEPENDENT}, this is the number of seconds to advance.
    * If {@link Clock#clockStep} is set to {@link ClockStep.SYSTEM_CLOCK_MULTIPLIER}, this value is multiplied by the
    * elapsed system time since the last call to {@link Clock#tick}.
    * Changing this property will change
    * {@link Clock#clockStep} from {@link ClockStep.SYSTEM_CLOCK} to
    * {@link ClockStep.SYSTEM_CLOCK_MULTIPLIER}.
    */
  var multiplier: Double = js.native
  
  /**
    * An {@link Event} that is fired whenever {@link Clock#stopTime} is reached.
    */
  var onStop: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An {@link Event} that is fired whenever {@link Clock#tick} is called.
    */
  var onTick: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Indicates whether {@link Clock#tick} should attempt to advance time.
    * The clock will only advance time when both
    * {@link Clock#canAnimate} and {@link Clock#shouldAnimate} are true.
    * Changing this property will change
    * {@link Clock#clockStep} from {@link ClockStep.SYSTEM_CLOCK} to
    * {@link ClockStep.SYSTEM_CLOCK_MULTIPLIER}.
    */
  var shouldAnimate: Boolean = js.native
  
  /**
    * The start time of the clock.
    */
  var startTime: JulianDate = js.native
  
  /**
    * The stop time of the clock.
    */
  var stopTime: JulianDate = js.native
  
  /**
    * Advances the clock from the current time based on the current configuration options.
    * tick should be called every frame, regardless of whether animation is taking place
    * or not.  To control animation, use the {@link Clock#shouldAnimate} property.
    * @returns The new value of the {@link Clock#currentTime} property.
    */
  def tick(): JulianDate = js.native
}
