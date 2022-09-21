package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Duration
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseChart.PointInteractionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseChart.TooltipInfo
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartOptions[TComponent]
  extends StObject
     with BaseWidgetOptions[TComponent] {
  
  /**
    * Specifies adaptive layout properties.
    */
  var adaptiveLayout: js.UndefOr[BaseChartAdaptiveLayout] = js.undefined
  
  /**
    * Specifies animation properties.
    */
  var animation: js.UndefOr[Duration | Boolean] = js.undefined
  
  /**
    * Customizes the appearance of an individual point label.
    */
  var customizeLabel: js.UndefOr[js.Function1[/* pointInfo */ Any, dxChartSeriesTypesCommonSeriesLabel]] = js.undefined
  
  /**
    * Customizes the appearance of an individual series point.
    */
  var customizePoint: js.UndefOr[js.Function1[/* pointInfo */ Any, dxChartSeriesTypesCommonSeriesPoint]] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[DataSourceLike[Any, Any]] = js.undefined
  
  /**
    * Specifies properties of the legend.
    */
  var legend: js.UndefOr[BaseChartLegend] = js.undefined
  
  /**
    * A function that is executed when all series are ready.
    */
  var onDone: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed when a series point is clicked or tapped.
    */
  var onPointClick: js.UndefOr[
    (js.Function1[
      /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & PointInteractionInfo, 
      Unit
    ]) | String
  ] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a series point.
    */
  var onPointHoverChanged: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & PointInteractionInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed when a series point is selected or selection is canceled.
    */
  var onPointSelectionChanged: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & PointInteractionInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip becomes hidden.
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & TooltipInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip appears.
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & TooltipInfo, Unit]] = js.undefined
  
  /**
    * Sets the palette to be used for colorizing series and their elements.
    */
  var palette: js.UndefOr[js.Array[String] | PaletteType] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of series (in the Chart UI component) or points in a series (in the PieChart UI component).
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionModeType] = js.undefined
  
  /**
    * Specifies whether a single point or multiple points can be selected in the chart.
    */
  var pointSelectionMode: js.UndefOr[multiple | single_] = js.undefined
  
  /**
    * Specifies properties for series.
    */
  var series: js.UndefOr[Any | js.Array[Any]] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_BaseChartOptions: js.UndefOr[BaseChartTooltip] = js.undefined
}
object BaseChartOptions {
  
  inline def apply[TComponent](): BaseChartOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartOptions[TComponent]]
  }
  
  extension [Self <: BaseChartOptions[?], TComponent](x: Self & BaseChartOptions[TComponent]) {
    
    inline def setAdaptiveLayout(value: BaseChartAdaptiveLayout): Self = StObject.set(x, "adaptiveLayout", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveLayoutUndefined: Self = StObject.set(x, "adaptiveLayout", js.undefined)
    
    inline def setAnimation(value: Duration | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCustomizeLabel(value: /* pointInfo */ Any => dxChartSeriesTypesCommonSeriesLabel): Self = StObject.set(x, "customizeLabel", js.Any.fromFunction1(value))
    
    inline def setCustomizeLabelUndefined: Self = StObject.set(x, "customizeLabel", js.undefined)
    
    inline def setCustomizePoint(value: /* pointInfo */ Any => dxChartSeriesTypesCommonSeriesPoint): Self = StObject.set(x, "customizePoint", js.Any.fromFunction1(value))
    
    inline def setCustomizePointUndefined: Self = StObject.set(x, "customizePoint", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Any, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setLegend(value: BaseChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setOnDone(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onDone", js.Any.fromFunction1(value))
    
    inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
    
    inline def setOnPointClick(
      value: (js.Function1[
          /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & PointInteractionInfo, 
          Unit
        ]) | String
    ): Self = StObject.set(x, "onPointClick", value.asInstanceOf[js.Any])
    
    inline def setOnPointClickFunction1(
      value: /* e */ (NativeEventInfo[TComponent, MouseEvent | PointerEvent]) & PointInteractionInfo => Unit
    ): Self = StObject.set(x, "onPointClick", js.Any.fromFunction1(value))
    
    inline def setOnPointClickUndefined: Self = StObject.set(x, "onPointClick", js.undefined)
    
    inline def setOnPointHoverChanged(value: /* e */ EventInfo[TComponent] & PointInteractionInfo => Unit): Self = StObject.set(x, "onPointHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnPointHoverChangedUndefined: Self = StObject.set(x, "onPointHoverChanged", js.undefined)
    
    inline def setOnPointSelectionChanged(value: /* e */ EventInfo[TComponent] & PointInteractionInfo => Unit): Self = StObject.set(x, "onPointSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnPointSelectionChangedUndefined: Self = StObject.set(x, "onPointSelectionChanged", js.undefined)
    
    inline def setOnTooltipHidden(value: /* e */ EventInfo[TComponent] & TooltipInfo => Unit): Self = StObject.set(x, "onTooltipHidden", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHiddenUndefined: Self = StObject.set(x, "onTooltipHidden", js.undefined)
    
    inline def setOnTooltipShown(value: /* e */ EventInfo[TComponent] & TooltipInfo => Unit): Self = StObject.set(x, "onTooltipShown", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShownUndefined: Self = StObject.set(x, "onTooltipShown", js.undefined)
    
    inline def setPalette(value: js.Array[String] | PaletteType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionModeType): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setPointSelectionMode(value: multiple | single_): Self = StObject.set(x, "pointSelectionMode", value.asInstanceOf[js.Any])
    
    inline def setPointSelectionModeUndefined: Self = StObject.set(x, "pointSelectionMode", js.undefined)
    
    inline def setSeries(value: Any | js.Array[Any]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: Any*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setTooltip(value: BaseChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
