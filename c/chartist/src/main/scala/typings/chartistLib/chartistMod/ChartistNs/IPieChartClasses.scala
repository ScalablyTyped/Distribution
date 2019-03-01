package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieChartClasses extends js.Object {
  var chartDonut: js.UndefOr[java.lang.String] = js.undefined
  var chartPie: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var series: js.UndefOr[java.lang.String] = js.undefined
  var sliceDonut: js.UndefOr[java.lang.String] = js.undefined
  var slicePie: js.UndefOr[java.lang.String] = js.undefined
}

object IPieChartClasses {
  @scala.inline
  def apply(
    chartDonut: java.lang.String = null,
    chartPie: java.lang.String = null,
    label: java.lang.String = null,
    series: java.lang.String = null,
    sliceDonut: java.lang.String = null,
    slicePie: java.lang.String = null
  ): IPieChartClasses = {
    val __obj = js.Dynamic.literal()
    if (chartDonut != null) __obj.updateDynamic("chartDonut")(chartDonut)
    if (chartPie != null) __obj.updateDynamic("chartPie")(chartPie)
    if (label != null) __obj.updateDynamic("label")(label)
    if (series != null) __obj.updateDynamic("series")(series)
    if (sliceDonut != null) __obj.updateDynamic("sliceDonut")(sliceDonut)
    if (slicePie != null) __obj.updateDynamic("slicePie")(slicePie)
    __obj.asInstanceOf[IPieChartClasses]
  }
}

