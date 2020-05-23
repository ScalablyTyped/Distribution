package typings.cssbeautify.mod

import typings.cssbeautify.cssbeautifyStrings.`end-of-line`
import typings.cssbeautify.cssbeautifyStrings.`separate-line`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Always inserts a semicolon after the last ruleset(default is false)
    */
  var autosemicolon: js.UndefOr[Boolean] = js.undefined
  /**
    * A string used for the indentation of the declaration (default is 4
    * spaces).
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * Defines the placement of open curly brace, either end-of-line (default)
    * or separate-line
    */
  var openbrace: js.UndefOr[`end-of-line` | `separate-line`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autosemicolon: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    openbrace: `end-of-line` | `separate-line` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autosemicolon)) __obj.updateDynamic("autosemicolon")(autosemicolon.get.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (openbrace != null) __obj.updateDynamic("openbrace")(openbrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

