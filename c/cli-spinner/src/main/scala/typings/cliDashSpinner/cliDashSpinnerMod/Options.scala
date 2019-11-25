package typings.cliDashSpinner.cliDashSpinnerMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onTick: js.UndefOr[js.ThisFunction1[/* this */ Spinner, /* msg */ String, Unit]] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onTick: js.ThisFunction1[/* this */ Spinner, /* msg */ String, Unit] = null,
    stream: WritableStream = null,
    text: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onTick != null) __obj.updateDynamic("onTick")(onTick.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

