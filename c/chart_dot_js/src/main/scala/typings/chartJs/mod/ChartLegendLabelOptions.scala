package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendLabelOptions extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, _]] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var generateLabels: js.UndefOr[js.Function1[/* chart */ Chart, js.Array[ChartLegendLabelItem]]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var usePointStyle: js.UndefOr[Boolean] = js.undefined
}

object ChartLegendLabelOptions {
  @scala.inline
  def apply(
    boxWidth: js.UndefOr[Double] = js.undefined,
    filter: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => _ = null,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    generateLabels: /* chart */ Chart => js.Array[ChartLegendLabelItem] = null,
    padding: js.UndefOr[Double] = js.undefined,
    usePointStyle: js.UndefOr[Boolean] = js.undefined
  ): ChartLegendLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boxWidth)) __obj.updateDynamic("boxWidth")(boxWidth.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (generateLabels != null) __obj.updateDynamic("generateLabels")(js.Any.fromFunction1(generateLabels))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePointStyle)) __obj.updateDynamic("usePointStyle")(usePointStyle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendLabelOptions]
  }
}

