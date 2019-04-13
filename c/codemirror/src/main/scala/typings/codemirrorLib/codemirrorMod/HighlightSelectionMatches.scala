package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSelectionMatches extends js.Object {
  /**
    * If annotateScrollbar is enabled, the occurences will be highlighted on the scrollbar via the matchesonscrollbar addon.
    */
  var annotateScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to specify how much time to wait, in milliseconds, before highlighting the matches. 
    */
  var delay: codemirrorLib.codemirrorLibNumbers.`100`
  /**
    * Minimum amount of selected characters that triggers a highlight (default 2).
    */
  var minChars: js.UndefOr[scala.Double] = js.undefined
  /**
    * Can be set to true or to a regexp matching the characters that make up a word.
    */
  var showToken: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  /**
    * The style to be used to highlight the matches (default "matchhighlight", which will correspond to CSS class cm-matchhighlight).
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether whitespace is trimmed from the selection.
    */
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If wordsOnly is enabled, the matches will be highlighted only if the selected text is a word.
    */
  var wordsOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object HighlightSelectionMatches {
  @scala.inline
  def apply(
    delay: codemirrorLib.codemirrorLibNumbers.`100`,
    annotateScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    minChars: scala.Int | scala.Double = null,
    showToken: scala.Boolean | stdLib.RegExp = null,
    style: java.lang.String = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    wordsOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): HighlightSelectionMatches = {
    val __obj = js.Dynamic.literal(delay = delay)
    if (!js.isUndefined(annotateScrollbar)) __obj.updateDynamic("annotateScrollbar")(annotateScrollbar)
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (showToken != null) __obj.updateDynamic("showToken")(showToken.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (!js.isUndefined(wordsOnly)) __obj.updateDynamic("wordsOnly")(wordsOnly)
    __obj.asInstanceOf[HighlightSelectionMatches]
  }
}

