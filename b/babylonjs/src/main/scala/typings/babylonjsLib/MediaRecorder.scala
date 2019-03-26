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

@JSGlobal("MediaRecorder")
@js.native
class MediaRecorderCls protected () extends MediaRecorder {
  /**
    * Creates a new MediaRecorder.
    * @param stream Defines the stream to record.
    * @param options Defines the options for the recorder available in the type MediaRecorderOptions.
    */
  def this(stream: stdLib.MediaStream) = this()
  def this(stream: stdLib.MediaStream, options: MediaRecorderOptions) = this()
  /** Event raised when a new chunk  of data is available and should be tracked. */
  /* CompleteClass */
  override def ondataavailable(event: stdLib.Event): scala.Unit = js.native
  /** Event raised when an error arised. */
  /* CompleteClass */
  override def onerror(event: stdLib.ErrorEvent): scala.Unit = js.native
  /** Event raised when the recording stops. */
  /* CompleteClass */
  override def onstop(event: stdLib.Event): scala.Unit = js.native
  /** Starts recording */
  /* CompleteClass */
  override def start(timeSlice: scala.Double): scala.Unit = js.native
  /** Stops recording */
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
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

