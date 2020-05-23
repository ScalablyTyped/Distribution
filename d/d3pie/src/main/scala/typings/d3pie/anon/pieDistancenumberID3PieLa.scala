package typings.d3pie.anon

import typings.d3pie.d3pieStrings.`label-percentage1`
import typings.d3pie.d3pieStrings.`label-percentage2`
import typings.d3pie.d3pieStrings.`label-value1`
import typings.d3pie.d3pieStrings.`label-value2`
import typings.d3pie.d3pieStrings.label
import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  pieDistance ? :number} & d3pie.d3pie.ID3PieLabelsOptions */
trait pieDistancenumberID3PieLa extends js.Object {
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.undefined
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
  var pieDistance: js.UndefOr[Double] = js.undefined
}

object pieDistancenumberID3PieLa {
  @scala.inline
  def apply(
    format: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2` = null,
    hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined,
    pieDistance: js.UndefOr[Double] = js.undefined
  ): pieDistancenumberID3PieLa = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWhenLessThanPercentage)) __obj.updateDynamic("hideWhenLessThanPercentage")(hideWhenLessThanPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pieDistance)) __obj.updateDynamic("pieDistance")(pieDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[pieDistancenumberID3PieLa]
  }
}

