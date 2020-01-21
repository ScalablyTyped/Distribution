package typings.cordovaPluginFile

import typings.std.Error
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides methods to monitor the asynchronous writing of blobs
  * to disk using progress events and event handler attributes.
  */
@js.native
trait FileSaver extends EventTarget {
  /** The last error that occurred on the FileSaver. */
  var error: Error = js.native
  /**
    * The FileSaver object can be in one of 3 states. The readyState attribute, on getting,
    * must return the current state, which must be one of the following values:
    *     INIT
    *     WRITING
    *     DONE
    */
  var readyState: Double = js.native
  /** Terminate file operation */
  def abort(): Unit = js.native
  /** Handler for abort events. */
  def onabort(event: ProgressEvent[EventTarget]): Unit = js.native
  /** Handler for error events. */
  def onerror(event: ProgressEvent[EventTarget]): Unit = js.native
  /** Handler for progress events. */
  def onprogress(event: ProgressEvent[EventTarget]): Unit = js.native
  /** Handler for write events. */
  def onwrite(event: ProgressEvent[EventTarget]): Unit = js.native
  /** Handler for writeend events. */
  def onwriteend(event: ProgressEvent[EventTarget]): Unit = js.native
  /** Handler for writestart events. */
  def onwritestart(event: ProgressEvent[EventTarget]): Unit = js.native
}

