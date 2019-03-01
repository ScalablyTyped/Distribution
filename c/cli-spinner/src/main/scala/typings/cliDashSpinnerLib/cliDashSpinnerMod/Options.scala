package typings
package cliDashSpinnerLib.cliDashSpinnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onTick: js.UndefOr[js.ThisFunction1[/* this */ Spinner, /* msg */ java.lang.String, scala.Unit]] = js.undefined
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onTick: js.ThisFunction1[/* this */ Spinner, /* msg */ java.lang.String, scala.Unit] = null,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    text: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onTick != null) __obj.updateDynamic("onTick")(onTick)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Options]
  }
}

