package typings.d3Timer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def timerFlush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timerFlush")().asInstanceOf[Unit]
  
  @js.native
  trait Timer_ extends StObject {
    
    /**
      * Restart a timer with the specified callback and optional delay and time.
      * This is equivalent to stopping this timer and creating a new timer with the specified arguments,
      * although this timer retains the original invocation priority.
      *
      * @param callback A callback function to be invoked and passed in the apparent
      * elapsed time since the timer became active in milliseconds.
      * @param delay An optional numeric delay in milliseconds (default = 0) relative to time.
      * @param time An optional time in milliseconds relative to which the delay is calculated (default = now).
      */
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit]): Unit = js.native
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit], delay: Double): Unit = js.native
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Unit = js.native
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Unit = js.native
    
    /**
      * Stop the timer.
      */
    def stop(): Unit = js.native
  }
}
