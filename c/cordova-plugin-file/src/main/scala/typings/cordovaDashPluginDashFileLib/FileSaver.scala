package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * This interface provides methods to monitor the asynchronous writing of blobs
 * to disk using progress events and event handler attributes.
 */
@js.native
trait FileSaver
  extends stdLib.EventTarget {
  /** The last error that occurred on the FileSaver. */
  var error: stdLib.Error = js.native
  /**
       * The FileSaver object can be in one of 3 states. The readyState attribute, on getting,
       * must return the current state, which must be one of the following values:
       *     INIT
       *     WRITING
       *     DONE
       */
  var readyState: scala.Double = js.native
  /** Terminate file operation */
  def abort(): scala.Unit = js.native
  /** Handler for abort events. */
  def onabort(event: stdLib.ProgressEvent): scala.Unit = js.native
  /** Handler for error events. */
  def onerror(event: stdLib.ProgressEvent): scala.Unit = js.native
  /** Handler for progress events. */
  def onprogress(event: stdLib.ProgressEvent): scala.Unit = js.native
  /** Handler for write events. */
  def onwrite(event: stdLib.ProgressEvent): scala.Unit = js.native
  /** Handler for writeend events. */
  def onwriteend(event: stdLib.ProgressEvent): scala.Unit = js.native
  /** Handler for writestart events. */
  def onwritestart(event: stdLib.ProgressEvent): scala.Unit = js.native
}

