package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchBrackets extends js.Object {
  /**
    * Only use the character after the start position, never the one before it.
    */
  var afterCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Don't highlight a bracket in a line longer than this. Defaults to 1000.
    */
  var maxHighlightLineLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ignore lines longer than this. Defaults to 10000.
    */
  var maxScanLineLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Stop after scanning this amount of lines without a successful match. Defaults to 1000.
    */
  var maxScanLines: js.UndefOr[scala.Double] = js.undefined
  /**
    * Causes only matches where both brackets are at the same side of the start position to be considered.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object MatchBrackets {
  @scala.inline
  def apply(
    afterCursor: js.UndefOr[scala.Boolean] = js.undefined,
    maxHighlightLineLength: scala.Int | scala.Double = null,
    maxScanLineLength: scala.Int | scala.Double = null,
    maxScanLines: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): MatchBrackets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterCursor)) __obj.updateDynamic("afterCursor")(afterCursor)
    if (maxHighlightLineLength != null) __obj.updateDynamic("maxHighlightLineLength")(maxHighlightLineLength.asInstanceOf[js.Any])
    if (maxScanLineLength != null) __obj.updateDynamic("maxScanLineLength")(maxScanLineLength.asInstanceOf[js.Any])
    if (maxScanLines != null) __obj.updateDynamic("maxScanLines")(maxScanLines.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[MatchBrackets]
  }
}

