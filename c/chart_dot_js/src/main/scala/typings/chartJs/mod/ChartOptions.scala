package typings.chartJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
  var animation: js.UndefOr[ChartAnimationOptions] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var circumference: js.UndefOr[Double] = js.native
  var cutoutPercentage: js.UndefOr[Double] = js.native
  var devicePixelRatio: js.UndefOr[Double] = js.native
  var elements: js.UndefOr[ChartElementsOptions] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
  var hover: js.UndefOr[ChartHoverOptions] = js.native
  var layout: js.UndefOr[ChartLayoutOptions] = js.native
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  var legendCallback: js.UndefOr[js.Function1[/* chart */ Chart, String]] = js.native
  var maintainAspectRatio: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      _
    ]
  ] = js.native
  var onHover: js.UndefOr[
    js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
  ] = js.native
  var onResize: js.UndefOr[js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, Unit]] = js.native
  var plugins: js.UndefOr[ChartPluginsOptions] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var responsiveAnimationDuration: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[RadialLinearScale] = js.native
  var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.native
  var showLines: js.UndefOr[Boolean] = js.native
  var spanGaps: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[ChartTitleOptions] = js.native
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: ChartAnimationOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setCircumference(value: Double): Self = this.set("circumference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircumference: Self = this.set("circumference", js.undefined)
    @scala.inline
    def setCutoutPercentage(value: Double): Self = this.set("cutoutPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutoutPercentage: Self = this.set("cutoutPercentage", js.undefined)
    @scala.inline
    def setDevicePixelRatio(value: Double): Self = this.set("devicePixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePixelRatio: Self = this.set("devicePixelRatio", js.undefined)
    @scala.inline
    def setElements(value: ChartElementsOptions): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHover(value: ChartHoverOptions): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setLayout(value: ChartLayoutOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendCallback(value: /* chart */ Chart => String): Self = this.set("legendCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLegendCallback: Self = this.set("legendCallback", js.undefined)
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = this.set("maintainAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainAspectRatio: Self = this.set("maintainAspectRatio", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => _
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(
      value: js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
    ): Self = this.set("onHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnResize(value: js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, Unit]): Self = this.set("onResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setPlugins(value: ChartPluginsOptions): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setResponsiveAnimationDuration(value: Double): Self = this.set("responsiveAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveAnimationDuration: Self = this.set("responsiveAnimationDuration", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: RadialLinearScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScales(value: ChartScales | LinearScale | LogarithmicScale | TimeScale): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setShowLines(value: Boolean): Self = this.set("showLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLines: Self = this.set("showLines", js.undefined)
    @scala.inline
    def setSpanGaps(value: Boolean): Self = this.set("spanGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanGaps: Self = this.set("spanGaps", js.undefined)
    @scala.inline
    def setTitle(value: ChartTitleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltips(value: ChartTooltipOptions): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
  }
  
}

