package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var formatter: js.UndefOr[js.Function1[/* context */ Anon_Inner, java.lang.String]] = js.undefined
  var inner: js.UndefOr[d3pieLib.d3pieNs.ID3PieLabelsOptions] = js.undefined
  var lines: js.UndefOr[Anon_ColorCurved] = js.undefined
  var mainLabel: js.UndefOr[d3pieLib.d3pieNs.ID3PieStyleOptions] = js.undefined
  var outer: js.UndefOr[Anon_PieDistance with d3pieLib.d3pieNs.ID3PieLabelsOptions] = js.undefined
  var percentage: js.UndefOr[Anon_DecimalPlaces with d3pieLib.d3pieNs.ID3PieStyleOptions] = js.undefined
  var truncation: js.UndefOr[Anon_Enabled] = js.undefined
  var value: js.UndefOr[d3pieLib.d3pieNs.ID3PieStyleOptions] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    formatter: js.Function1[/* context */ Anon_Inner, java.lang.String] = null,
    inner: d3pieLib.d3pieNs.ID3PieLabelsOptions = null,
    lines: Anon_ColorCurved = null,
    mainLabel: d3pieLib.d3pieNs.ID3PieStyleOptions = null,
    outer: Anon_PieDistance with d3pieLib.d3pieNs.ID3PieLabelsOptions = null,
    percentage: Anon_DecimalPlaces with d3pieLib.d3pieNs.ID3PieStyleOptions = null,
    truncation: Anon_Enabled = null,
    value: d3pieLib.d3pieNs.ID3PieStyleOptions = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (mainLabel != null) __obj.updateDynamic("mainLabel")(mainLabel)
    if (outer != null) __obj.updateDynamic("outer")(outer)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage)
    if (truncation != null) __obj.updateDynamic("truncation")(truncation)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Context]
  }
}

