package typings.codemirror.mod

import typings.codemirror.codemirrorNumbers.`100`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightSelectionMatches extends js.Object {
  /**
    * If annotateScrollbar is enabled, the occurences will be highlighted on the scrollbar via the matchesonscrollbar addon.
    */
  var annotateScrollbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to specify how much time to wait, in milliseconds, before highlighting the matches. 
    */
  var delay: `100`
  /**
    * Minimum amount of selected characters that triggers a highlight (default 2).
    */
  var minChars: js.UndefOr[Double] = js.undefined
  /**
    * Can be set to true or to a regexp matching the characters that make up a word.
    */
  var showToken: js.UndefOr[Boolean | RegExp] = js.undefined
  /**
    * The style to be used to highlight the matches (default "matchhighlight", which will correspond to CSS class cm-matchhighlight).
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    * Controls whether whitespace is trimmed from the selection.
    */
  var trim: js.UndefOr[Boolean] = js.undefined
  /**
    * If wordsOnly is enabled, the matches will be highlighted only if the selected text is a word.
    */
  var wordsOnly: js.UndefOr[Boolean] = js.undefined
}

object HighlightSelectionMatches {
  @scala.inline
  def apply(
    delay: `100`,
    annotateScrollbar: js.UndefOr[Boolean] = js.undefined,
    minChars: Int | Double = null,
    showToken: Boolean | RegExp = null,
    style: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    wordsOnly: js.UndefOr[Boolean] = js.undefined
  ): HighlightSelectionMatches = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    if (!js.isUndefined(annotateScrollbar)) __obj.updateDynamic("annotateScrollbar")(annotateScrollbar.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (showToken != null) __obj.updateDynamic("showToken")(showToken.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (!js.isUndefined(wordsOnly)) __obj.updateDynamic("wordsOnly")(wordsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSelectionMatches]
  }
}

