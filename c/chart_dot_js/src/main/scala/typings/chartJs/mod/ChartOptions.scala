package typings.chartJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptions extends StObject {
  
  var animation: js.UndefOr[ChartAnimationOptions] = js.undefined
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var circumference: js.UndefOr[Double] = js.undefined
  
  var cutoutPercentage: js.UndefOr[Double] = js.undefined
  
  var defaultColor: js.UndefOr[ChartColor] = js.undefined
  
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  
  var elements: js.UndefOr[ChartElementsOptions] = js.undefined
  
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  var hover: js.UndefOr[ChartHoverOptions] = js.undefined
  
  var layout: js.UndefOr[ChartLayoutOptions] = js.undefined
  
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  
  var legendCallback: js.UndefOr[js.Function1[/* chart */ Chart, String]] = js.undefined
  
  var maintainAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[MouseEvent], 
      /* activeElements */ js.UndefOr[js.Array[js.Object]], 
      js.Any
    ]
  ] = js.undefined
  
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ Chart, 
      /* event */ MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      js.Any
    ]
  ] = js.undefined
  
  var onResize: js.UndefOr[js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, Unit]] = js.undefined
  
  var plugins: js.UndefOr[ChartPluginsOptions] = js.undefined
  
  var responsive: js.UndefOr[Boolean] = js.undefined
  
  var responsiveAnimationDuration: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[RadialLinearScale] = js.undefined
  
  var scales: js.UndefOr[ChartScales | LinearScale | LogarithmicScale | TimeScale] = js.undefined
  
  var showLines: js.UndefOr[Boolean] = js.undefined
  
  var spanGaps: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[ChartTitleOptions] = js.undefined
  
  var tooltips: js.UndefOr[ChartTooltipOptions] = js.undefined
}
object ChartOptions {
  
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: ChartAnimationOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircumferenceUndefined: Self = StObject.set(x, "circumference", js.undefined)
    
    @scala.inline
    def setCutoutPercentage(value: Double): Self = StObject.set(x, "cutoutPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoutPercentageUndefined: Self = StObject.set(x, "cutoutPercentage", js.undefined)
    
    @scala.inline
    def setDefaultColor(value: ChartColor): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    @scala.inline
    def setDefaultColorVarargs(value: String*): Self = StObject.set(x, "defaultColor", js.Array(value :_*))
    
    @scala.inline
    def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
    
    @scala.inline
    def setElements(value: ChartElementsOptions): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHover(value: ChartHoverOptions): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setLayout(value: ChartLayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendCallback(value: /* chart */ Chart => String): Self = StObject.set(x, "legendCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendCallbackUndefined: Self = StObject.set(x, "legendCallback", js.undefined)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainAspectRatioUndefined: Self = StObject.set(x, "maintainAspectRatio", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: (/* event */ js.UndefOr[MouseEvent], /* activeElements */ js.UndefOr[js.Array[js.Object]]) => js.Any
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnHover(
      value: js.ThisFunction2[
          /* this */ Chart, 
          /* event */ MouseEvent, 
          /* activeElements */ js.Array[js.Object], 
          js.Any
        ]
    ): Self = StObject.set(x, "onHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setOnResize(value: js.ThisFunction1[/* this */ Chart, /* newSize */ ChartSize, Unit]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    @scala.inline
    def setPlugins(value: ChartPluginsOptions): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveAnimationDuration(value: Double): Self = StObject.set(x, "responsiveAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveAnimationDurationUndefined: Self = StObject.set(x, "responsiveAnimationDuration", js.undefined)
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: RadialLinearScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScales(value: ChartScales | LinearScale | LogarithmicScale | TimeScale): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    @scala.inline
    def setShowLines(value: Boolean): Self = StObject.set(x, "showLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLinesUndefined: Self = StObject.set(x, "showLines", js.undefined)
    
    @scala.inline
    def setSpanGaps(value: Boolean): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanGapsUndefined: Self = StObject.set(x, "spanGaps", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartTitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltips(value: ChartTooltipOptions): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
  }
}
