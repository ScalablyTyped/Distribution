package typings
package atBabelCodeDashFrameLib.codeDashFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelCodeFrameOptions extends js.Object {
  /**
    * Forcibly syntax highlight the code as JavaScript (for non-terminals);
    * overrides highlightCode.
    * default: false
    */
  var forceColor: js.UndefOr[scala.Boolean] = js.undefined
  /** Syntax highlight the code as JavaScript for terminals. default: false */
  var highlightCode: js.UndefOr[scala.Boolean] = js.undefined
  /**  The number of lines to show above the error. default: 2 */
  var linesAbove: js.UndefOr[scala.Double] = js.undefined
  /**  The number of lines to show below the error. default: 3 */
  var linesBelow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pass in a string to be displayed inline (if possible) next to the
    * highlighted location in the code. If it can't be positioned inline,
    * it will be placed above the code frame.
    * default: nothing
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

