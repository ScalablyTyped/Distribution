package typings.d3pie

import typings.d3pie.d3pie.ID3PieLabelsOptions
import typings.d3pie.d3pie.ID3PieStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var formatter: js.UndefOr[js.Function1[/* context */ Anon_Inner, String]] = js.undefined
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.undefined
  var lines: js.UndefOr[Anon_ColorCurved] = js.undefined
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.undefined
  var outer: js.UndefOr[Anon_PieDistance with ID3PieLabelsOptions] = js.undefined
  var percentage: js.UndefOr[Anon_DecimalPlaces with ID3PieStyleOptions] = js.undefined
  var truncation: js.UndefOr[Anon_Enabled] = js.undefined
  var value: js.UndefOr[ID3PieStyleOptions] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    formatter: /* context */ Anon_Inner => String = null,
    inner: ID3PieLabelsOptions = null,
    lines: Anon_ColorCurved = null,
    mainLabel: ID3PieStyleOptions = null,
    outer: Anon_PieDistance with ID3PieLabelsOptions = null,
    percentage: Anon_DecimalPlaces with ID3PieStyleOptions = null,
    truncation: Anon_Enabled = null,
    value: ID3PieStyleOptions = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mainLabel != null) __obj.updateDynamic("mainLabel")(mainLabel.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (truncation != null) __obj.updateDynamic("truncation")(truncation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

