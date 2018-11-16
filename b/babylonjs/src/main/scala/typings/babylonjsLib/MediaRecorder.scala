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

