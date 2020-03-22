package typings.copyToClipboard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
   // MIME type
  var onCopy: js.UndefOr[js.Function1[/* clipboardData */ js.Object, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    message: String = null,
    onCopy: /* clipboardData */ js.Object => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    __obj.asInstanceOf[Options]
  }
}

