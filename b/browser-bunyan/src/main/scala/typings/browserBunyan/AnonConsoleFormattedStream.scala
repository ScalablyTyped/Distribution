package typings.browserBunyan

import typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream
import typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsoleFormattedStream extends js.Object {
  var ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream
  var ConsoleRawStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
}

object AnonConsoleFormattedStream {
  @scala.inline
  def apply(ConsoleFormattedStream: ConsoleFormattedStream, ConsoleRawStream: ConsoleRawStream): AnonConsoleFormattedStream = {
    val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsoleFormattedStream]
  }
}

