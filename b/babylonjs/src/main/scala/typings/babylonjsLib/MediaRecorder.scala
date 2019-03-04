package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorder extends js.Object {
  /** Event raised when a new chunk  of data is available and should be tracked. */
  def ondataavailable(event: stdLib.Event): scala.Unit
  /** Event raised when an error arised. */
  def onerror(event: stdLib.ErrorEvent): scala.Unit
  /** Event raised when the recording stops. */
  def onstop(event: stdLib.Event): scala.Unit
  /** Starts recording */
  def start(timeSlice: scala.Double): scala.Unit
  /** Stops recording */
  def stop(): scala.Unit
}

object MediaRecorder {
  @scala.inline
  def apply(
    ondataavailable: js.Function1[stdLib.Event, scala.Unit],
    onerror: js.Function1[stdLib.ErrorEvent, scala.Unit],
    onstop: js.Function1[stdLib.Event, scala.Unit],
    start: js.Function1[scala.Double, scala.Unit],
    stop: js.Function0[scala.Unit]
  ): MediaRecorder = {
    val __obj = js.Dynamic.literal(ondataavailable = ondataavailable, onerror = onerror, onstop = onstop, start = start, stop = stop)
  
    __obj.asInstanceOf[MediaRecorder]
  }
}

