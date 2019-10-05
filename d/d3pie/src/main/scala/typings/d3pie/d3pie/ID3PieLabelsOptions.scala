package typings.d3pie.d3pie

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

trait ID3PieLabelsOptions extends js.Object {
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.undefined
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
}

object ID3PieLabelsOptions {
  @scala.inline
  def apply(
    format: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2` = null,
    hideWhenLessThanPercentage: Int | Double = null
  ): ID3PieLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hideWhenLessThanPercentage != null) __obj.updateDynamic("hideWhenLessThanPercentage")(hideWhenLessThanPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieLabelsOptions]
  }
}

