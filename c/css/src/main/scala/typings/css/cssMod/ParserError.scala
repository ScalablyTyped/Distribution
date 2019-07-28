package typings.css.cssMod

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
    column: Int | Double = null,
    filename: String = null,
    line: Int | Double = null,
    message: String = null,
    reason: String = null,
    source: String = null
  ): ParserError = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ParserError]
  }
}

