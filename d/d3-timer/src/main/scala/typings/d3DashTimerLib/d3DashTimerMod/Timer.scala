package typings
package d3DashTimerLib.d3DashTimerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timer extends js.Object {
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
  def restart(callbackFn: js.Function1[/* elapsed */ scala.Double, scala.Unit]): scala.Unit = js.native
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
  def restart(callbackFn: js.Function1[/* elapsed */ scala.Double, scala.Unit], delay: scala.Double): scala.Unit = js.native
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
  def restart(
    callbackFn: js.Function1[/* elapsed */ scala.Double, scala.Unit],
    delay: scala.Double,
    time: scala.Double
  ): scala.Unit = js.native
  /**
       * Stop the timer.
       */
  def stop(): scala.Unit = js.native
}

