package typings.browserBunyan.anon

import typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleFormattedStream extends js.Object {
  var ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream
  var ConsoleRawStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleRawStream
}

object ConsoleFormattedStream {
  @scala.inline
  def apply(
    ConsoleFormattedStream: typings.browserBunyan.mod.BrowserBunyan.ConsoleFormattedStream,
    ConsoleRawStream: ConsoleRawStream
  ): ConsoleFormattedStream = {
    val __obj = js.Dynamic.literal(ConsoleFormattedStream = ConsoleFormattedStream.asInstanceOf[js.Any], ConsoleRawStream = ConsoleRawStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleFormattedStream]
  }
}

