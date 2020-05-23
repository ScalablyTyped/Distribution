package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /** Silently fail on parse errors */
  var silent: js.UndefOr[Boolean] = js.undefined
  /** The path to the file containing css. Makes errors and source maps more helpful, by letting them know where code comes from. */
  var source: js.UndefOr[String] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(silent: js.UndefOr[Boolean] = js.undefined, source: String = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

