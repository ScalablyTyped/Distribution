package typings.chartist.chartistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPieChartClasses extends js.Object {
  var chartDonut: js.UndefOr[String] = js.undefined
  var chartPie: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[String] = js.undefined
  var sliceDonut: js.UndefOr[String] = js.undefined
  var slicePie: js.UndefOr[String] = js.undefined
}

object IPieChartClasses {
  @scala.inline
  def apply(
    chartDonut: String = null,
    chartPie: String = null,
    label: String = null,
    series: String = null,
    sliceDonut: String = null,
    slicePie: String = null
  ): IPieChartClasses = {
    val __obj = js.Dynamic.literal()
    if (chartDonut != null) __obj.updateDynamic("chartDonut")(chartDonut.asInstanceOf[js.Any])
    if (chartPie != null) __obj.updateDynamic("chartPie")(chartPie.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (sliceDonut != null) __obj.updateDynamic("sliceDonut")(sliceDonut.asInstanceOf[js.Any])
    if (slicePie != null) __obj.updateDynamic("slicePie")(slicePie.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPieChartClasses]
  }
}

