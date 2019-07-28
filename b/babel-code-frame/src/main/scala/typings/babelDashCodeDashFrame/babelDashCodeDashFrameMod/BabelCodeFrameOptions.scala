package typings.babelDashCodeDashFrame.babelDashCodeDashFrameMod

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
  /**  The number of lines to show below the error. default: 3 */
  var linesAbove: js.UndefOr[Double] = js.undefined
  /**  The number of lines to show above the error. default: 2 */
  var linesBelow: js.UndefOr[Double] = js.undefined
}

object BabelCodeFrameOptions {
  @scala.inline
  def apply(
    forceColor: js.UndefOr[Boolean] = js.undefined,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    linesAbove: Int | Double = null,
    linesBelow: Int | Double = null
  ): BabelCodeFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceColor)) __obj.updateDynamic("forceColor")(forceColor)
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode)
    if (linesAbove != null) __obj.updateDynamic("linesAbove")(linesAbove.asInstanceOf[js.Any])
    if (linesBelow != null) __obj.updateDynamic("linesBelow")(linesBelow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelCodeFrameOptions]
  }
}

