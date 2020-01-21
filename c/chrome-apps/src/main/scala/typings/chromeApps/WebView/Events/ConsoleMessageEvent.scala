package typings.chromeApps.WebView.Events

import typings.chromeApps.chrome.integer
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the guest window logs a console message.
  * The following example code forwards all log messages to the embedder's console without regard for log level or other properties.
  */
@js.native
trait ConsoleMessageEvent extends Event_ {
  /**
    * The severity level of the log message.
    * Ranges from -1 to 2.
    * LOG_VERBOSE (console.debug) = -1
    * LOG_INFO (console.log, console.info) = 0
    * LOG_WARNING (console.warn) = 1
    * LOG_ERROR (console.error) = 2
    */
  var level: ConsoleMessageLevel = js.native
  /** The line number of the message source. */
  var line: integer = js.native
  /** The logged message contents. */
  var message: String = js.native
  /** A string identifying the resource which logged the message. */
  var sourceId: String = js.native
}

