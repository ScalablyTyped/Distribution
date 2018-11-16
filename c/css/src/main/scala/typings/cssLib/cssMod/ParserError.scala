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

