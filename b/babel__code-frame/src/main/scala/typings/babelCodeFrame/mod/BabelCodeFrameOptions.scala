package typings.babelCodeFrame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelCodeFrameOptions extends js.Object {
  /**
    * Forcibly syntax highlight the code as JavaScript (for non-terminals);
    * overrides highlightCode.
    * default: false
    */
  var forceColor: js.UndefOr[Boolean] = js.undefined
  /** Syntax highlight the code as JavaScript for terminals. default: false */
  var highlightCode: js.UndefOr[Boolean] = js.undefined
  /**  The number of lines to show above the error. default: 2 */
  var linesAbove: js.UndefOr[Double] = js.undefined
  /**  The number of lines to show below the error. default: 3 */
  var linesBelow: js.UndefOr[Double] = js.undefined
  /**
    * Pass in a string to be displayed inline (if possible) next to the
    * highlighted location in the code. If it can't be positioned inline,
    * it will be placed above the code frame.
    * default: nothing
    */
  var message: js.UndefOr[String] = js.undefined
}

object BabelCodeFrameOptions {
  @scala.inline
  def apply(
    forceColor: js.UndefOr[Boolean] = js.undefined,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    linesAbove: Int | Double = null,
    linesBelow: Int | Double = null,
    message: String = null
  ): BabelCodeFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceColor)) __obj.updateDynamic("forceColor")(forceColor.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.asInstanceOf[js.Any])
    if (linesAbove != null) __obj.updateDynamic("linesAbove")(linesAbove.asInstanceOf[js.Any])
    if (linesBelow != null) __obj.updateDynamic("linesBelow")(linesBelow.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelCodeFrameOptions]
  }
}

