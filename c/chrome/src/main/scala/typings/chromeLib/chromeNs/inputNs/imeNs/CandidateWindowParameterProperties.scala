package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateWindowParameterProperties extends js.Object {
  /**
    * Optional.
    * Text that is shown at the bottom of the candidate window.
    */
  var auxiliaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * True to display the auxiliary text, false to hide it.
    */
  var auxiliaryTextVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * True to show the cursor, false to hide it.
    */
  var cursorVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * The number of candidates to display per page.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * True if the candidate window should be rendered vertical, false to make it horizontal.
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * True to show the Candidate window, false to hide it.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Where to display the candidate window.
    * @since Chrome 28.
    */
  var windowPosition: js.UndefOr[java.lang.String] = js.undefined
}

object CandidateWindowParameterProperties {
  @scala.inline
  def apply(
    auxiliaryText: java.lang.String = null,
    auxiliaryTextVisible: js.UndefOr[scala.Boolean] = js.undefined,
    cursorVisible: js.UndefOr[scala.Boolean] = js.undefined,
    pageSize: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    windowPosition: java.lang.String = null
  ): CandidateWindowParameterProperties = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryText != null) __obj.updateDynamic("auxiliaryText")(auxiliaryText)
    if (!js.isUndefined(auxiliaryTextVisible)) __obj.updateDynamic("auxiliaryTextVisible")(auxiliaryTextVisible)
    if (!js.isUndefined(cursorVisible)) __obj.updateDynamic("cursorVisible")(cursorVisible)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition)
    __obj.asInstanceOf[CandidateWindowParameterProperties]
  }
}

