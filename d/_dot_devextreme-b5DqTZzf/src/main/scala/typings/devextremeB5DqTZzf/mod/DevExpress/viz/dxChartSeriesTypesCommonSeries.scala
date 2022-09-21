package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.EdgeLength
import typings.devextremeB5DqTZzf.anon.Level
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allArgumentPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.allSeriesPoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.excludePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.includePoints
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.nearestPoint
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onlyPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeries extends StObject {
  
  /**
    * Configures data aggregation for the series.
    */
  var aggregation: js.UndefOr[dxChartSeriesTypesCommonSeriesAggregation] = js.undefined
  
  /**
    * Specifies which data source field provides arguments for series points.
    */
  var argumentField: js.UndefOr[String] = js.undefined
  
  /**
    * Binds the series to a value axis.
    */
  var axis: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to group bar series so that bars with the same argument overlap.
    */
  var barOverlapGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Controls the padding and consequently the width of all bars in a series using relative units. Ignored if the barWidth property is set.
    */
  var barPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a fixed width for all bars in a series, measured in pixels. Takes precedence over the barPadding property.
    */
  var barWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the series border (in area-like series) or the series point border (in bar-like and bubble series).
    */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesBorder] = js.undefined
  
  /**
    * Specifies which data source field provides close values for points of a financial series.
    */
  var closeValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the color of the series.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Makes bars look rounded. Applies only to bar-like series.
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the dash style of the series line. Applies only to line-like series.
    */
  var dashStyle: js.UndefOr[DashStyleType] = js.undefined
  
  /**
    * Specifies which data source field provides high values for points of a financial series.
    */
  var highValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user points to a series.
    */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user points to it.
    */
  var hoverStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyle] = js.undefined
  
  /**
    * Specifies whether the series should ignore null data points.
    */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a filling color for the body of a series point that visualizes a non-reduced value. Applies only to candlestick series.
    */
  var innerColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures point labels.
    */
  var label: js.UndefOr[dxChartSeriesTypesCommonSeriesLabel] = js.undefined
  
  /**
    * Specifies which data source field provides low values for points of a financial series.
    */
  var lowValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a limit for the number of point labels.
    */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimal possible height (or length if the chart is rotated) of a bar in pixels. Applies only to bar-like series.
    */
  var minBarSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how transparent the series should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies which data source field provides open values for points of a financial series.
    */
  var openValueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which pane the series should belong to. Accepts the name of the pane.
    */
  var pane: js.UndefOr[String] = js.undefined
  
  /**
    * Configures series points in scatter, line- and area-like series.
    */
  var point: js.UndefOr[dxChartSeriesTypesCommonSeriesPoint] = js.undefined
  
  /**
    * Coupled with the rangeValue2Field property, specifies which data source field provides values for a range-like series.
    */
  var rangeValue1Field: js.UndefOr[String] = js.undefined
  
  /**
    * Coupled with the rangeValue1Field property, specifies which data source field provides values for a range-like series.
    */
  var rangeValue2Field: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies reduction properties for financial series.
    */
  var reduction: js.UndefOr[Level] = js.undefined
  
  /**
    * Specifies series elements to be highlighted when a user selects a series.
    */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.undefined
  
  /**
    * Configures the appearance adopted by the series when a user selects it.
    */
  var selectionStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyle] = js.undefined
  
  /**
    * Specifies whether to show the series in the legend or not.
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies which data source field provides size values for bubbles. Required by and applies only to bubble series.
    */
  var sizeField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which stack the series should belongs to. Applies only to stacked bar and full-stacked bar series.
    */
  var stack: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which data source field provides auxiliary data for series points.
    */
  var tagField: js.UndefOr[String] = js.undefined
  
  /**
    * Configures error bars.
    */
  var valueErrorBar: js.UndefOr[EdgeLength] = js.undefined
  
  /**
    * Specifies which data source field provides values for series points.
    */
  var valueField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the series is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the series line in pixels. Applies only to line-like series.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartSeriesTypesCommonSeries {
  
  inline def apply(): dxChartSeriesTypesCommonSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeries]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeries](x: Self) {
    
    inline def setAggregation(value: dxChartSeriesTypesCommonSeriesAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setArgumentField(value: String): Self = StObject.set(x, "argumentField", value.asInstanceOf[js.Any])
    
    inline def setArgumentFieldUndefined: Self = StObject.set(x, "argumentField", js.undefined)
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBarOverlapGroup(value: String): Self = StObject.set(x, "barOverlapGroup", value.asInstanceOf[js.Any])
    
    inline def setBarOverlapGroupUndefined: Self = StObject.set(x, "barOverlapGroup", js.undefined)
    
    inline def setBarPadding(value: Double): Self = StObject.set(x, "barPadding", value.asInstanceOf[js.Any])
    
    inline def setBarPaddingUndefined: Self = StObject.set(x, "barPadding", js.undefined)
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def setBorder(value: dxChartSeriesTypesCommonSeriesBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCloseValueField(value: String): Self = StObject.set(x, "closeValueField", value.asInstanceOf[js.Any])
    
    inline def setCloseValueFieldUndefined: Self = StObject.set(x, "closeValueField", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDashStyle(value: DashStyleType): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setHighValueField(value: String): Self = StObject.set(x, "highValueField", value.asInstanceOf[js.Any])
    
    inline def setHighValueFieldUndefined: Self = StObject.set(x, "highValueField", js.undefined)
    
    inline def setHoverMode(
      value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
    ): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setHoverStyle(value: dxChartSeriesTypesCommonSeriesHoverStyle): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setIgnoreEmptyPoints(value: Boolean): Self = StObject.set(x, "ignoreEmptyPoints", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyPointsUndefined: Self = StObject.set(x, "ignoreEmptyPoints", js.undefined)
    
    inline def setInnerColor(value: String): Self = StObject.set(x, "innerColor", value.asInstanceOf[js.Any])
    
    inline def setInnerColorUndefined: Self = StObject.set(x, "innerColor", js.undefined)
    
    inline def setLabel(value: dxChartSeriesTypesCommonSeriesLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLowValueField(value: String): Self = StObject.set(x, "lowValueField", value.asInstanceOf[js.Any])
    
    inline def setLowValueFieldUndefined: Self = StObject.set(x, "lowValueField", js.undefined)
    
    inline def setMaxLabelCount(value: Double): Self = StObject.set(x, "maxLabelCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelCountUndefined: Self = StObject.set(x, "maxLabelCount", js.undefined)
    
    inline def setMinBarSize(value: Double): Self = StObject.set(x, "minBarSize", value.asInstanceOf[js.Any])
    
    inline def setMinBarSizeUndefined: Self = StObject.set(x, "minBarSize", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpenValueField(value: String): Self = StObject.set(x, "openValueField", value.asInstanceOf[js.Any])
    
    inline def setOpenValueFieldUndefined: Self = StObject.set(x, "openValueField", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPoint(value: dxChartSeriesTypesCommonSeriesPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRangeValue1Field(value: String): Self = StObject.set(x, "rangeValue1Field", value.asInstanceOf[js.Any])
    
    inline def setRangeValue1FieldUndefined: Self = StObject.set(x, "rangeValue1Field", js.undefined)
    
    inline def setRangeValue2Field(value: String): Self = StObject.set(x, "rangeValue2Field", value.asInstanceOf[js.Any])
    
    inline def setRangeValue2FieldUndefined: Self = StObject.set(x, "rangeValue2Field", js.undefined)
    
    inline def setReduction(value: Level): Self = StObject.set(x, "reduction", value.asInstanceOf[js.Any])
    
    inline def setReductionUndefined: Self = StObject.set(x, "reduction", js.undefined)
    
    inline def setSelectionMode(value: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionStyle(value: dxChartSeriesTypesCommonSeriesSelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    
    inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTagField(value: String): Self = StObject.set(x, "tagField", value.asInstanceOf[js.Any])
    
    inline def setTagFieldUndefined: Self = StObject.set(x, "tagField", js.undefined)
    
    inline def setValueErrorBar(value: EdgeLength): Self = StObject.set(x, "valueErrorBar", value.asInstanceOf[js.Any])
    
    inline def setValueErrorBarUndefined: Self = StObject.set(x, "valueErrorBar", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
