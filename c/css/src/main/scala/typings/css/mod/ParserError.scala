package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserError extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var filename: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  /** The full error message with the source position. */
  var message: js.UndefOr[String] = js.undefined
  /** The error message without position. */
  var reason: js.UndefOr[String] = js.undefined
  /** The portion of code that couldn't be parsed. */
  var source: js.UndefOr[String] = js.undefined
}

object ParserError {
  @scala.inline
  def apply(
    column: js.UndefOr[Double] = js.undefined,
    filename: String = null,
    line: js.UndefOr[Double] = js.undefined,
    message: String = null,
    reason: String = null,
    source: String = null
  ): ParserError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserError]
  }
}

