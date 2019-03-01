package typings
package d3pieLib.d3pieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieLabelsOptions extends js.Object {
  var format: js.UndefOr[
    d3pieLib.d3pieLibStrings.label | d3pieLib.d3pieLibStrings.value | d3pieLib.d3pieLibStrings.percentage | d3pieLib.d3pieLibStrings.`label-value1` | d3pieLib.d3pieLibStrings.`label-value2` | d3pieLib.d3pieLibStrings.`label-percentage1` | d3pieLib.d3pieLibStrings.`label-percentage2`
  ] = js.undefined
  var hideWhenLessThanPercentage: js.UndefOr[scala.Double] = js.undefined
}

object ID3PieLabelsOptions {
  @scala.inline
  def apply(
    format: d3pieLib.d3pieLibStrings.label | d3pieLib.d3pieLibStrings.value | d3pieLib.d3pieLibStrings.percentage | d3pieLib.d3pieLibStrings.`label-value1` | d3pieLib.d3pieLibStrings.`label-value2` | d3pieLib.d3pieLibStrings.`label-percentage1` | d3pieLib.d3pieLibStrings.`label-percentage2` = null,
    hideWhenLessThanPercentage: scala.Int | scala.Double = null
  ): ID3PieLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hideWhenLessThanPercentage != null) __obj.updateDynamic("hideWhenLessThanPercentage")(hideWhenLessThanPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieLabelsOptions]
  }
}

