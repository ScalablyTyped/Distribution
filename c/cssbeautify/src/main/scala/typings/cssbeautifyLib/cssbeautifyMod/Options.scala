package typings
package cssbeautifyLib.cssbeautifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
     * Always inserts a semicolon after the last ruleset(default is false)
     */
  var autosemicolon: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * A string used for the indentation of the declaration (default is 4
     * spaces).
     */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Defines the placement of open curly brace, either end-of-line (default)
     * or separate-line
     */
  var openbrace: js.UndefOr[
    cssbeautifyLib.cssbeautifyLibStrings.`end-of-line` | cssbeautifyLib.cssbeautifyLibStrings.`separate-line`
  ] = js.undefined
}

