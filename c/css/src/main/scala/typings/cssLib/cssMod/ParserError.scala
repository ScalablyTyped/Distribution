package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserError extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  /** The full error message with the source position. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** The error message without position. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The portion of code that couldn't be parsed. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object ParserError {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    filename: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    reason: java.lang.String = null,
    source: java.lang.String = null
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

