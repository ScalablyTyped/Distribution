package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchBrackets extends js.Object {
  /**
    * Only use the character after the start position, never the one before it.
    */
  var afterCursor: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't highlight a bracket in a line longer than this. Defaults to 1000.
    */
  var maxHighlightLineLength: js.UndefOr[Double] = js.undefined
  /**
    * Ignore lines longer than this. Defaults to 10000.
    */
  var maxScanLineLength: js.UndefOr[Double] = js.undefined
  /**
    * Stop after scanning this amount of lines without a successful match. Defaults to 1000.
    */
  var maxScanLines: js.UndefOr[Double] = js.undefined
  /**
    * Causes only matches where both brackets are at the same side of the start position to be considered.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object MatchBrackets {
  @scala.inline
  def apply(
    afterCursor: js.UndefOr[Boolean] = js.undefined,
    maxHighlightLineLength: js.UndefOr[Double] = js.undefined,
    maxScanLineLength: js.UndefOr[Double] = js.undefined,
    maxScanLines: js.UndefOr[Double] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): MatchBrackets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterCursor)) __obj.updateDynamic("afterCursor")(afterCursor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHighlightLineLength)) __obj.updateDynamic("maxHighlightLineLength")(maxHighlightLineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScanLineLength)) __obj.updateDynamic("maxScanLineLength")(maxScanLineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScanLines)) __obj.updateDynamic("maxScanLines")(maxScanLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchBrackets]
  }
}

