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
    ondataavailable: stdLib.Event => scala.Unit,
    onerror: stdLib.ErrorEvent => scala.Unit,
    onstop: stdLib.Event => scala.Unit,
    start: scala.Double => scala.Unit,
    stop: () => scala.Unit
  ): MediaRecorder = {
    val __obj = js.Dynamic.literal(ondataavailable = js.Any.fromFunction1(ondataavailable), onerror = js.Any.fromFunction1(onerror), onstop = js.Any.fromFunction1(onstop), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[MediaRecorder]
  }
}

