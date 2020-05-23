package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieLabelsOptions
import typings.d3pie.d3pie.ID3PieStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  var formatter: js.UndefOr[js.Function1[/* context */ Section, String]] = js.undefined
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.undefined
  var lines: js.UndefOr[Enabled] = js.undefined
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.undefined
  var outer: js.UndefOr[pieDistancenumberID3PieLa] = js.undefined
  var percentage: js.UndefOr[decimalPlacesnumberID3Pie] = js.undefined
  var truncation: js.UndefOr[TruncateLength] = js.undefined
  var value: js.UndefOr[ID3PieStyleOptions] = js.undefined
}

object Formatter {
  @scala.inline
  def apply(
    formatter: /* context */ Section => String = null,
    inner: ID3PieLabelsOptions = null,
    lines: Enabled = null,
    mainLabel: ID3PieStyleOptions = null,
    outer: pieDistancenumberID3PieLa = null,
    percentage: decimalPlacesnumberID3Pie = null,
    truncation: TruncateLength = null,
    value: ID3PieStyleOptions = null
  ): Formatter = {
    val __obj = js.Dynamic.literal()
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mainLabel != null) __obj.updateDynamic("mainLabel")(mainLabel.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (truncation != null) __obj.updateDynamic("truncation")(truncation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatter]
  }
}

