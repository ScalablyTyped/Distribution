package typings.consola.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONReporterOptions extends js.Object {
  var stream: js.UndefOr[WritableStream] = js.undefined
}

object JSONReporterOptions {
  @scala.inline
  def apply(stream: WritableStream = null): JSONReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONReporterOptions]
  }
}

